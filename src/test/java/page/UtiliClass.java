package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtiliClass {
    private WebDriver driver;

    public UtiliClass(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        driver = new ChromeDriver();
        return driver;
    }

    public void Maximaze() {
        driver.manage().window().maximize();
    }

    public WebElement Xpath(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public WebElement Iframe(By locator) {
        return driver.findElement(locator);
    }

    public void escribirText(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void acceder(String url) {
        driver.get(url);
    }

    public void scrol(By locator) {
        WebElement iframe = driver.findElement(locator);
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();

    }

    public void seleccionarComando(Keys ke, By locator) {
        driver.findElement(locator).sendKeys(ke);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getTextRadioButton(By locator) {
        return driver.findElement(locator).getAttribute("Value");
    }

    public void selectValueDropdown(By locator, String value) {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(value);
    }

    public String getTextDropdownSelect(By locator) {
        Select dropdown = new Select(driver.findElement(locator));
        return dropdown.getFirstSelectedOption().getText();
    }

    public void selectListaAvanzadaByValue(By locator, String value){
        driver.findElement(locator).sendKeys(value);
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }
}