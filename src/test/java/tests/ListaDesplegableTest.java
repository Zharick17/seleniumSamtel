package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.ListaDesplegable;

public class ListaDesplegableTest {
    private WebDriver driver;
    private ListaDesplegable lista;

    @Before
    public void inicio() {
        lista = new ListaDesplegable(driver);
        driver = lista.chromeDriverConnection();
        lista.Maximaze();
        lista.acceder("https://pageresources.000webhostapp.com/test_pages/page_one.html");

    }

    @Test
    public void validarComboSimple() {
        lista.selectValueDropdown(lista.comboSimple, "Huevos");
        assertEquals(lista.getTextDropdownSelect(lista.comboSimple), "Huevos");
    }

    @Test
    public void validarComboMultiple() {
        lista.selectValueDropdown(lista.comboMultiple, "Plátano");
        assertEquals(lista.getTextDropdownSelect(lista.comboMultiple), "Plátano");
    }

    @Test
    public void validarRadioBebidas() {
        lista.click(lista.radioAguaOfBebidas);
        assertEquals(lista.getTextRadioButton(lista.radioAguaOfBebidas), "agua");
    }

    @Test
    public void validarRadioComidas() {
        lista.click(lista.radioDoradoOfComida);
        assertEquals(lista.getTextRadioButton(lista.radioDoradoOfComida), "dorada");
    }

    @Test
    public void validarRadioListaCompras() {
        lista.click(lista.radioCarneOfListaCompras);
        assertEquals(lista.getTextRadioButton(lista.radioCarneOfListaCompras), "carne");
    }

    @Test
    public void validarBotonImplicito(){
        lista.esperas(lista.botonImplicito);
        lista.click(lista.botonImplicito);
        
    }

    @Test
    public void validarBotonExplicito(){
        lista.esperas(lista.botonExplicito);
        lista.click(lista.botonExplicito);
    }

    @After
    public void fin() {
        driver.quit();
    }

}
