import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewSimpleTest {


    @Test
    public void loginToEon() {
        //preconditie
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        //deschidere browser
        WebDriver driver = new FirefoxDriver();
        //navigare destinatie
        driver.navigate().to("https://www.eon.ro/");


        WebElement eonMylineButton = driver.findElement(By.id("myline-desktop-user-menu-link"));
        eonMylineButton.click();

        WebElement eonAutentificareButton = driver.findElement(By.xpath("//*[@id=\"myline-user-menu-list\"]/div/ul/li[4]/span"
        ));
        eonAutentificareButton.click();
        WebElement inputEmail = driver.findElement(By.id("userName"));
        WebElement inputParola = driver.findElement(By.id("password"));
        WebElement eonLoginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/form/div[3]/div/div/button/span"));
        inputEmail.sendKeys("paulet.catalin@yahoo.ro");
        inputParola.sendKeys("abcd urs");
        eonLoginButton.click();


        Assert.assertTrue(eonLoginButton.isDisplayed());
        driver.quit();

    }

    @Test
    public void cautareInformatiiPaginaEon() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.eon.ro/");

        WebElement eonSearchButton = driver.findElement(By.xpath("//*[@id=\"navigation-search-header-link\"]/i"));
        eonSearchButton.click();
        WebElement inputInformatie = driver.findElement(By.xpath("//*[@id=\"navigation-search-header-container\"]/div/div/div/div/div[1]/form/input"));


        inputInformatie.sendKeys("electricitate");
        WebElement pressSearchButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[4]/div[2]/div/div/div/div/div/div/div[1]/form/button"));
        pressSearchButton.click();
        //TODO
//        WebElement searchResult= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div/div/p"));
//        Assert.assertTrue(searchResult.isDisplayed());
        driver.quit();


    }

    @Test
    public void testEonPageByLogo() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.eon.ro/");

        WebElement Eonlogo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[4]/div[1]/header/div[2]/nav/div/div[1]/a/img"));
        Assert.assertTrue(Eonlogo.isDisplayed());
        driver.quit();

    }

    @Test
    public void checkTheClientiBussinesPage() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.eon.ro/");

        WebElement ClientiBussinesButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[1]/div/div[4]/div[1]/header/div[2]/nav/div/div[3]/div[1]/div[1]/ul/li[2]/a"));
        ClientiBussinesButton.click();
        WebElement XPathCorectDirectionare = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/div[2]"));
        Assert.assertTrue(XPathCorectDirectionare.isDisplayed());

//        WebElement solicitaOferta=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/div/div/div[1]/a/p"));
//        solicitaOferta.click();
//        WebElement XPathPaginaOfertei=driver.findElement(By.xpath("//*[@id=\"lead-form\"]/div[1]/div/h3"));
//        Assert.assertTrue(XPathPaginaOfertei.isDisplayed());
        driver.quit();
    }
}


