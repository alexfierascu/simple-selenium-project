import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {

    @Test
    public void facebookSignUp(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_o")).sendKeys("Stefan");//name
        driver.findElement(By.id("u_0_q")).sendKeys("Harbuzaru");//last name

        driver.findElement(By.id("u_0_t")).sendKeys("stefanenered@gmail.com");//mail
        driver.findElement(By.id("u_0_w")).sendKeys("stefanenered@gmail.com");//mail

        driver.findElement(By.id("u_0_y")).sendKeys("cea mai tare parola");//password
        Select month = new Select(driver.findElement(By.id("month")));//luna
        month.selectByVisibleText("Sep");
        Select date = new Select(driver.findElement(By.id("day")));//zi
        date.selectByVisibleText("7");
        Select year = new Select(driver.findElement(By.id("year")));//an
        year.selectByVisibleText("1988");



        driver.findElement(By.id("u_0_7")).click(); // gender select

        driver.findElement(By.id("u_0_15")).click(); //submit button
        //driver.findElement(By.name("websubmit")).click();
        //TODO 1
        /*
        * 1. use a wait in selenium (implicit/ explicit)
        * 2. verify that you are on verification page
        * 3. input text into input text area field
        * */
        //driver.findElement(By.id("code_in_cliff")).sendKeys("stop");//code doesn t work

        //TODO 2
        // a test without at least an assertion is not a test!!!


        //driver.quit();
    }


}
