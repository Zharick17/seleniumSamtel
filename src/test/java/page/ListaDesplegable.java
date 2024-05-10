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
