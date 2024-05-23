package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtiliClass {
    private WebDriver driver;

    public UtiliClass(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement buscarElementoConTiempoDeEspera(By locator){
        WebDriverWait waits = new WebDriverWait(driver,  Duration.ofSeconds(5000));
        return waits.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void Maximaze() {
        driver.manage().window().maximize();
    }

    public WebElement Xpath(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        buscarElementoConTiempoDeEspera(locator).click();
    }

    public WebElement Iframe(By locator) {
        return driver.findElement(locator);
    }

    public void escribirText(String inputText, By locator) {
        buscarElementoConTiempoDeEspera(locator).sendKeys(inputText);
    }

    public void acceder(String url) {
        driver.get(url);
    }

    public void scrol(By locator) {
        WebElement iframe = buscarElementoConTiempoDeEspera(locator);
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();

    }

    public void seleccionarComando(Keys key, By locator) {
        buscarElementoConTiempoDeEspera(locator).sendKeys(key);
    }

    public String getText(By locator) {
        return buscarElementoConTiempoDeEspera(locator).getText();
    }

    public String getTextRadioButton(By locator) {
        return buscarElementoConTiempoDeEspera(locator).getAttribute("Value");
    }

    public void selectValueDropdown(By locator, String value) {
        Select dropdown = new Select(buscarElementoConTiempoDeEspera(locator));
        dropdown.selectByVisibleText(value);
    }

    public String getTextDropdownSelect(By locator) {
        Select dropdown = new Select(buscarElementoConTiempoDeEspera(locator));
        return dropdown.getFirstSelectedOption().getText();
    }

    public void selectListaAvanzadaByValue(By locator, String value){
        buscarElementoConTiempoDeEspera(locator).sendKeys(value);
        buscarElementoConTiempoDeEspera(locator).sendKeys(Keys.ENTER);
    }

}