package tests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.Formulario;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormularioTest {

    private WebDriver driver;

    private Formulario form;
    
    @Before
    public void inicio(){
       form = new Formulario(driver);   
       driver = form.chromeDriverConnection();
       form.Maximaze();
       form.acceder("https://demoqa.com/automation-practice-form");
    }
     
    @Test
    public void CompletarFormularioConLosCamposBasicosRequeridos(){

        form.escribirText("Daniela", form.nombreUsuario);
        form.escribirText("Barreto",form.apellidoUsuario);
        form.escribirText("hola", form.temasUsuario);
        form.escribirText("Bogota", form.direccionUsuario);
       

        form.seleccionarComando(Keys.PAGE_DOWN, form.direccionUsuario);

        form.click(form.boton);

    }

    @After

    public void fin(){
        driver.quit();
    }


    
}
