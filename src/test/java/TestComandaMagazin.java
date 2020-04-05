import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;


public class TestComandaMagazin extends BaseClass {

    @Test
    public void testAccesareSite() {
        getDriver().navigate().to("https://www.depurtat.ro/");
        Assert.assertEquals(getDriver().getTitle(), "dEpurtat - Cel mai bun raport calitate/pret la incaltaminte de dama");
    }

    @Test
    public void testAccesareContOnline() {
        getDriver().navigate().to("https://www.depurtat.ro/");
        WebElement butonLogin = getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[1]/a/img"));
        butonLogin.click();
        WebElement accesareCont = getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[1]/div/a[1]"));
        accesareCont.click();
        WebElement inputEmail = getDriver().findElement(By.id("profile_email"));
        WebElement inputParola = getDriver().findElement(By.id("profile_password"));
        WebElement depurtatLoginButton = getDriver().findElement(xpath("/html/body/main/div/div/div/div[3]/div/div[1]/form/div[4]/div[2]/button"));
        inputEmail.sendKeys("anna.nicullescu@gmail.com");
        inputParola.sendKeys("ana");
        depurtatLoginButton.click();
        WebElement autentification = getDriver().findElement(By.id("message_profile_password"));
        Assert.assertTrue(autentification.isDisplayed());

    }

    @Test
    public void testAdaugareProduseInCos() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);

        getDriver().navigate().to("https://www.depurtat.ro/");
        WebElement acceptCookiesButton = getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/a"));
        acceptCookiesButton.click();
        WebElement butonPromotii = getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/nav/ul/li[2]/a"));
        butonPromotii.click();
        Assert.assertEquals(getDriver().getTitle(), "Promotii - dEpurtat");


        Actions action = new Actions(getDriver());
        WebElement primulProdusVeziDetaliiButton = getDriver().findElement(By.xpath("//*[@id=\"page_content\"]/div[5]/div/div[1]/div/div[2]/div[3]/a[1]"));
        action.moveToElement(primulProdusVeziDetaliiButton).click().build().perform();

        //explicit wait
        //Thread.sleep(3000);
        WebElement titluArticolPrimulProdus = getDriver().findElement(By.xpath("/html/body/main/div/div/div/div[5]/div/div[1]/div/div[2]/a"));
        String numeProdus = titluArticolPrimulProdus.getText();
        System.out.println("numele produsului este " + numeProdus);

        //implicit wait
        wait.until(ExpectedConditions.textToBe(By.xpath("/html/body/main/div/div/div/div[3]/div[2]/h1"), numeProdus));


        WebElement titluProdus = getDriver().findElement(By.xpath("/html/body/main/div/div/div/div[3]/div[2]/h1"));
        String numeProdusDinPagina = titluProdus.getText();


        Assert.assertEquals(numeProdus, numeProdusDinPagina);


        Select marimePantofi = new Select(getDriver().findElement(By.xpath("/html/body/main/div/div/div/div[3]/div[2]/form/div[6]/select")));

        marimePantofi.selectByIndex(2);

        WebElement butonAdaugaProdusInCos = getDriver().findElement(xpath("/html/body/main/div/div/div/div[3]/div[2]/form/div[9]/span[1]/button"));

        butonAdaugaProdusInCos.click();
        //todo -ana de continuat

//        WebElement marimePantofi= getDriver().findElement(xpath("//*[@id=\"buy_7802690_27884\"]"));
//        marimePantofi.findElements(xpath("/html/body/main/div/div/div/div[3]/div[2]/form/div[5]/select/option[3]"));
//        marimePantofi.click();
//        ;
//        WebElement buttonProduseInCos=getDriver().findElement(xpath("/html/body/header/div[1]/div[1]/div/div[3]/a/span/img"));

    }
}
