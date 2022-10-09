package com.nhsbsa.costchecker.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Config {

    private static WebDriver driver;

    public static String getURL() {
        String getURL = System.getenv("NHSBSA_COSTS_CHECKER");
        return getURL;
    }

    public static WebDriver setDriver() throws MalformedURLException {
        String browser = System.getProperty("browser");

        switch (browser) {
            case "chrome":
                driver = chromeDriver();
                break;
            case "firefox":
                driver = firefoxDriver();
                break;
            case "headless":
                driver = headlessDriver();
                break;
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver headlessDriver() {
        String proxyAddress = System.getProperty("proxy");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        if (proxyAddress != null) {
            Proxy proxy = new Proxy();
            proxy.setAutodetect(false);
            proxy.setHttpProxy(proxyAddress);
            proxy.setSslProxy(proxyAddress);
            proxy.setNoProxy("localhost");
            System.out.println("Using proxy for http and ssl: " + proxyAddress);
            options.setCapability("proxy", proxy);
        }
        WebDriver driver = new ChromeDriver(options);
        configureCommonSettings(driver);
        return driver;
    }

    private static WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.javascript", 1);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        configureCommonSettings(driver);
        return driver;
    }

    private static WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        configureCommonSettings(driver);
        return driver;
    }

    private static void configureCommonSettings(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().window().maximize();
    }
}