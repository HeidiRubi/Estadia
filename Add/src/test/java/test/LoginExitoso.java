package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExitoso {

    public static WebDriver driver;

    public static void main(String[] args) {
        AbrirElNavegador();
        EntrarAlaPagina();
        EncontrarCorreoYEscribirlo();
        EncontrarContraseñaYEscribirla();
        EncontrarBotonYDarleClick();
        EncontrarBuscadorYBuscar();
    }

    private static void AbrirElNavegador() {
        driver = new ChromeDriver();
    }

    private static void EntrarAlaPagina() {
        driver.get("https://facebook.com");
        WebElement linkMensajetxt = driver.findElement(By.linkText(" \"Facebook te ayuda a comunicarte y compartir con las personas que forman parte de tu vida."));
        String linktxtMensaje = linkMensajetxt.getText();
    }

    private static void EncontrarCorreoYEscribirlo() {
    WebElement campoEmail = driver.findElement(By.id("email"));
    campoEmail.sendKeys("frankbassvans@gmail.com");
    //driver.getText();
    }

    private static void EncontrarContraseñaYEscribirla() {

    }

    private static void EncontrarBotonYDarleClick() {

    }

    private static void EncontrarBuscadorYBuscar() {

    }


}
