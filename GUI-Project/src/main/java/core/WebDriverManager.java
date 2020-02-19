package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public WebDriver webDriver;
    private static WebDriverManager webDriverManager = null;

    private WebDriverManager() {
        webDriver = new ChromeDriver();
    }

    public static WebDriverManager getInstance() {
        if (webDriverManager == null || webDriverManager.webDriver == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    public void quitDriver() {
        webDriver.quit();
        webDriver = null;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
