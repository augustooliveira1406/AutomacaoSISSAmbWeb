package br.com.sissonline.core;

import br.com.sissonline.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String nomeCenario;
    private static File diretorio;
    private static int numPrint; //contador dos prints da tela

    public static File getDiretorio() {
        return diretorio;
    }

    public static String getNomeCenario() {
        return nomeCenario;
    }

    public static void setNomeCenario(String nomeCenario) {
        Driver.nomeCenario = nomeCenario;
    }

    public static void criaDiretorio(){
        String caminho = "src/test/resources/evidencias";
        diretorio = new File(caminho + "/" + nomeCenario);
        diretorio.mkdir();  //criando diretorio
        numPrint = 0;  //zerando o print apos criar o diretorio
    }

    public static void printScreen(String passo) throws IOException {
        numPrint++;
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath() + "/" + numPrint + " - " + passo + ".png";
        //criando o arquivo com Extensão correta
        FileUtils.copyFile(file, new File(caminho));
    }


    public Driver(Browser navegador){

        switch (navegador){
            case CHROME:
                startChrome();
                break;
            case FIREFOX:
                startFirefox();
                break;
            case EDGE:
                startEdge();
                break;
            case IE:
                startIE();
                break;
        }
        wait = new WebDriverWait(driver, 10);

        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1280, 1030));
        driver.manage().window().setPosition(new Point(1280, 0));
    }

    private void startIE() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    private void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    private void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        chromeOptions.setHeadless(headless);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1280, 1030));
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void visibilityOf(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void attributeChange(WebElement element, String attribute, String value ){
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }

    public static void logPrint() {
    }

    public static void aguardaOptions(Select select){
        for (int i = 0; i < 6; i++){
            if(select.getOptions().size() > 1){
                return;
            }
            try {
                Thread.sleep( 500);
            } catch (Exception e) {

            }
        }

        }

}
