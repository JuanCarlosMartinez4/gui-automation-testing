package calculator;

import core.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CalculatorPage {
    private WebDriver webDriver;

    private static final String URL = "https://www.calculadora.org/";
    private By itemValue;
    private static final By SCREEN_BY = By.cssSelector(".screen");

    public CalculatorPage() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    private String getResult() {
        return webDriver.findElement(By.xpath("//*[@id=\"calculator\"]/div[1]/div")).getText();
    }

    public String doOperation(String values) {
        webDriver.get(URL);
        webDriver.manage().window().setSize(new Dimension(1280, 800));
        for (Object item : values.toCharArray()) {
            itemValue = By.xpath("//span[text()='"+item+"']");
            webDriver.findElement(itemValue).click();
        }
        webDriver.findElement(SCREEN_BY).click();
        String result = getResult();
        WebDriverManager.getInstance().quitDriver();
        return result;
    }
}
