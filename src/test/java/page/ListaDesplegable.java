package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListaDesplegable extends UtiliClass {

    public ListaDesplegable(WebDriver driver) {
        super(driver);
        
    }

    public By comboUno = By.xpath("//select[@id='combobox1']");
    public By comboDos = By.xpath("//select[@id='combobox2']");
    public By bebida = By.xpath("//input[@type='radio' and @name='bebida' and @value='agua']");
    public By comida = By.xpath("//input[@type='radio' and @name='comida2' and @value='dorada']");
    public By comprLista = By.xpath("//input[@type='checkbox' and @name='listaCompra' and @value='carne']");
   

    public String seleccionarComboUno(){
        WebElement elementCombo = Xpath(comboUno);
        Select seleccionOpcion = new Select (elementCombo);
        seleccionOpcion.selectByVisibleText("Huevos");
        return getText(seleccionOpcion.getFirstSelectedOption());
    }

    public String seleccionarComboDos(){
        Select opcionSeleccionar = new Select(Xpath(comboDos));
        opcionSeleccionar.selectByVisibleText("Plátano");
        return getText(opcionSeleccionar.getFirstSelectedOption());

    }
    
}
