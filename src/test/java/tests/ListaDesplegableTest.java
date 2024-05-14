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

    public void inicio(){
        lista = new ListaDesplegable(driver);
        driver = lista.chromeDriverConnection();
        lista.Maximaze();
        lista.acceder("https://pageresources.000webhostapp.com/test_pages/page_one.html");

    }

    @Test

    public void listaComboUno(){
        assertEquals(lista.seleccionarComboUno(), "Huevos");
    }

    @Test

    public void listaComboDos(){
        assertEquals(lista.seleccionarComboDos(),"Plátano");
    }

    @Test

    public void seleccionarBebida(){
       lista.click(lista.bebida); 
    }

    @Test

    public void seleccionarComida(){
        lista.click(lista.comida);
    }

    @Test

    public void seleccionarLista(){
        lista.click(lista.comprLista);
    }

    @After

    public void fin(){
        driver.quit();
    }



}
