import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class TestComandaMagazin extends BaseClass {
    @Test
    public void testAccesareSite(){
    driver.navigate().to("https://www.depurtat.ro/");
    Assert.assertEquals(driver.getTitle(),"dEpurtat - Cel mai bun raport calitate/pret la incaltaminte de dama");
    }
    @Test
    public void testAccesareContOnline(){
        driver.navigate().to("https://www.depurtat.ro/");
        WebElement butonLogin=getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[1]/a/img"));
        butonLogin.click();
        WebElement accesareCont=getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[1]/div/a[1]"));
        accesareCont.click();
        WebElement inputEmail= driver.findElement(By.id("profile_email"));
        WebElement inputParola=driver.findElement(By.id("profile_password"));
        WebElement depurtatLoginButton=driver.findElement(xpath("/html/body/main/div/div/div/div[3]/div/div[1]/form/div[4]/div[2]/button"));
        inputEmail.sendKeys("anna.nicullescu@gmail.com");
        inputParola.sendKeys("ana");
        depurtatLoginButton.click();
        WebElement autentification=getDriver().findElement(By.id("message_profile_password"));
        Assert.assertTrue(autentification.isDisplayed());
    }
    @Test
    public void testAdaugareProduseInCos() throws InterruptedException {
        driver.navigate().to("https://www.depurtat.ro/");
        Thread.sleep(5000);
        WebElement buttonPantofi= getDriver().findElement(xpath("/html/body/header/div[2]/div/nav/ul/li[2]/a"));
        buttonPantofi.click();
        Actions action = new Actions(driver);
        WebElement nu= getDriver().findElement(By.xpath("/html/body/main/div/div/div/div[5]/div/div[1]/div/div[1]/a[1]"));
        action.moveToElement(nu).click(getDriver().findElement(xpath("/html/body/main/div/div/div/div[5]/div/div[1]/div/div[2]/div[3]/a[1]"))).build().perform();
        Thread.sleep(5000);
        WebElement marimePantofi= getDriver().findElement(xpath("//*[@id=\"buy_7802690_27884\"]"));
        marimePantofi.findElements(xpath("/html/body/main/div/div/div/div[3]/div[2]/form/div[5]/select/option[3]"));
        marimePantofi.click();
        WebElement buttonAdaugaProdusInCos=getDriver().findElement(xpath("/html/body/main/div/div/div/div[3]/div[2]/form/div[8]/span[1]/button"));
        buttonAdaugaProdusInCos.click();
        WebElement buttonProduseInCos=getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[3]/a/span/img"));

    }
}
