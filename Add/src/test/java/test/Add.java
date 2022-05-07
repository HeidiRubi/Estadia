package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add {

    public static WebDriver driver;

    public static void main(String[] args) {

        AbrirElNavegador();
        EntrarAlaPagina();
        EncontrarCorreoYEscribirlo();
        EncontrarContraseñaYEscribirla();
        EncontrarBotonYDarleClick();
        EncontrarBuscadorYBuscar();
        EncontrarAlUsuarioYagregarlo();
    }

    private static void AbrirElNavegador() {

        driver = new ChromeDriver();
    }

    private static void EntrarAlaPagina() {

        driver.get("https://facebook.com");
    }

    private static void EncontrarCorreoYEscribirlo() {
        //WebDriver usuario = driver.findElement(By);
    }

    private static void EncontrarContraseñaYEscribirla() {
    }

    private static void EncontrarBotonYDarleClick() {
    }

    private static void EncontrarBuscadorYBuscar() {
    }

    private static void EncontrarAlUsuarioYagregarlo() {
    }
}
