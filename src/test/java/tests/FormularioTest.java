package tests;
import static org.junit.Assert.assertEquals;

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
        form.escribirText("daniela12@gmail.com", form.correoUsuario);
        form.click(form.generoMujer);
        form.escribirText("3200560250", form.numeroUsuario);
        form.escribirText("27/Mayo/2024",form.campoFecha);
        form.escribirText("Hola, como vas", form.temasUsuario);
        form.click(form.pasatiempoMusica);
        form.subirArchivo("C:\\Users\\zharick.barreto\\Downloads\\imagen1.png", form.seleccionarArchivo);
        form.escribirText("Bogota", form.direccionUsuario);
        form.seleccionarComando(Keys.PAGE_DOWN, form.direccionUsuario);

        form.click(form.boton);
    }

    @Test
    public void IngresarUnNombreConCaracteresEspeciales(){

        form.escribirText("Daniela@12.", form.nombreUsuario);
        form.escribirText("Barreto", form.apellidoUsuario);
        form.escribirText("3112642333", form.numeroUsuario);
        form.seleccionarComando(Keys.PAGE_DOWN, form.direccionUsuario);

        form.click(form.boton);

    }


    @Test
    public void IngresarUnTelefonoConCaracteresEspeciales(){

        form.escribirText("Daniela", form.nombreUsuario);
        form.escribirText("Barreto", form.apellidoUsuario);
        form.escribirText("311@mn*21!0", form.numeroUsuario);
        form.seleccionarComando(Keys.PAGE_DOWN, form.direccionUsuario);

        form.click(form.boton);

    }

    @Test
    public void seleccionarListaDesplegable(){
        form.seleccionarComando(Keys.PAGE_DOWN, form.direccionUsuario);
        form.selectListaAvanzadaByValue(form.inputSelect, "Haryana");
    }

    @Test
    public void validacionDelCampoFecha(){
        form.escribirText("07/marzo/2024", form.campoFecha);
        assertEquals(form.getText(form.fecha), "07 Mar 2024");
    }

     @Test
    public void validarRadioGenero(){
        form.click(form.generoMujer);
        assertEquals(form.getTextRadioButton(form.generoMujer), "Female");
          
    }

    @Test
    public void validarRadioPasatiempos(){
        form.click(form.pasatiempoMusica);
        assertEquals(form.getTextRadioButton(form.pasatiempoMusica), "3");
    }

    @Test
    public void validacionDeSeleccionDeImagen(){
        form.subirArchivo("C:\\Users\\zharick.barreto\\Downloads\\imagen1.png", form.seleccionarArchivo); 
      
    }

    

    @After
    public void fin(){
        driver.quit();
    }
    
}
