package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setup.DriverSetup.getDriver;

public class MainPage {

    private String titluMainPage = "dEpurtat - Cel mai bun raport calitate/pret la incaltaminte de dama";
    private WebElement acceptCookiesButton = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/a"));
    private WebElement butonNoutati = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul/li[2]/a"));
    public static WebElement butonPromotii = getDriver().findElement(By.xpath("valoare"));
    private WebElement butonPantofi = getDriver().findElement(By.xpath("valoare"));
    private WebElement butonSport = getDriver().findElement(By.xpath("valoare"));
    private WebElement butonUser = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
    private WebElement butonAccesareCont = getDriver().findElement(By.xpath("/html/body/header/div[1]/div[1]/div/div[1]/div/a[1]"));

}
