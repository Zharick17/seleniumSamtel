package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Formulario extends UtiliClass {

    public Formulario (WebDriver driver){
        super(driver);
    }

    public By nombreUsuario = By.xpath("//input[@id='firstName']");
    public By apellidoUsuario = By.xpath("//input[@id='lastName']");
    public By correoUsuario = By.xpath("//input[@id='userEmail']");
    public By numeroUsuario = By.xpath("//input[@id='userNumber']");
    public By temasUsuario = By.xpath("//input[@id='subjectsInput']");
    public By direccionUsuario = By.xpath("//textarea[@id='currentAddress']");
    public By boton = By.xpath("//button[@id='submit']");
    public By inputSelect = By.xpath("//input[@id='react-select-3-input']");
    public By campoFecha = By.xpath("//input[@id='dateOfBirthInput']");
    public By fecha= By.xpath("//div[@aria-label='Elegir jueves, 7 de marzo de 2024']");
    public By generoMujer = By.xpath("//input[@id='gender-radio-2']");
    public By pasatiempoMusica = By.xpath("//*[@id=\"hobbies-checkbox-3\"]");
    public By seleccionarArchivo = By.xpath("//input[@id='uploadPicture']");
}
