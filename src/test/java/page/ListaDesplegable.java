package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDesplegable extends UtiliClass {

    public ListaDesplegable(WebDriver driver) {
        super(driver);
        
    }

    public By comboSimple = By.xpath("//select[@id='combobox1']");
    public By comboMultiple = By.xpath("//select[@id='combobox2']");
    public By radioAguaOfBebidas = By.xpath("//input[@type='radio' and @name='bebida' and @value='agua']");
    public By radioDoradoOfComida = By.xpath("//input[@type='radio' and @name='comida2' and @value='dorada']");
    public By radioCarneOfListaCompras = By.xpath("//input[@type='checkbox' and @name='listaCompra' and @value='carne']");
    public By botonImplicito = By.xpath("//button[@id='implicitWaitButton']");
    public By botonExplicito = By.xpath("//button[@id='explicitWaitButton']");
    
}
