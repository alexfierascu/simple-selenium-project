import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestQa {
    @Test
    public void testEmagPage(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.emag.ro/");
        String titluRaspuns = "eMAG.ro - Libertate în fiecare zi";
        String titlulActual = driver.getTitle();
        Assert.assertEquals(titlulActual, titluRaspuns);
        driver.quit();
    }
    @Test
    public void testLogoEmag(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("https://www.emag.ro/");
        WebElement logoEmag=driver.findElement(By.xpath("/html/body/div[4]/nav[1]/div/div/div[1]/a/img"));
        Assert.assertTrue(logoEmag.isDisplayed());
        driver.quit();
    }
    @Test
    public void testMagazinLogin(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("https://www.depurtat.ro/login");
        WebElement inputEmail=driver.findElement(By.id("email"));
        WebElement inputPass=driver.findElement(By.id("pass"));
        WebElement magazinLoginButton=driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/div/div[1]/form/div[4]/div[2]/button")
        inputEmail.sendKeys("anna.nicullescu@gmail.com");
        inputPass.sendKeys("niculescu");
        magazinLoginButton.click();
        Assert.assertEquals(driver.getTitle(), "Accesare cont");
        WebElement xPathMesajEroare=driver.findElement(By.xpath("//*[@id=\"page_login_form\"]"));
        Assert.assertTrue(xPathMesajEroare.isDisplayed());
        driver.quit();
    }

}
