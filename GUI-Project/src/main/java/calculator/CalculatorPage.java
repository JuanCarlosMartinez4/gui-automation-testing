package calculator;

import core.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 * allows to test Calculator
 */
public class CalculatorPage {

    private WebDriver webDriver;
    private static final String URL_SIMPLE = "https://www.calculadora.org/";
    private static final String URL_SCIENTIFIC = "https://www.calculadora.org/cientifica/";
    private By itemValue;
    private static final By SCREEN_BY = By.cssSelector(".screen");

    /**
     * Allows to initialize web driver manager.
     */
    public CalculatorPage() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * Gets result of operation.
     * @return result as String.
     */
    private String getResult() {
        return webDriver.findElement(By.xpath("//*[@id=\"calculator\"]/div[1]/div")).getText();
    }

    /**
     * Implements math action.
     * @param values is a String.
     * @return result of operation.
     */
    public String doOperation(String values) {
        webDriver.get(URL_SIMPLE);
        webDriver.manage().window().setSize(new Dimension(1280, 800));
        for (Object item : values.toCharArray()) {
            itemValue = By.xpath("//span[text()='" + item + "']");
            webDriver.findElement(itemValue).click();
        }
        webDriver.findElement(SCREEN_BY).click();
        String result = getResult();
        WebDriverManager.getInstance().quitDriver();
        return result;
    }
}
