import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignUp {

    @Test
    public void facebookSignUp(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_o")).sendKeys("Stefan");
        driver.findElement(By.id("u_0_q")).sendKeys("Harbuzaru");

        driver.findElement(By.id("u_0_t")).sendKeys("stefanenered@gmail.com");
        driver.findElement(By.id("u_0_w")).sendKeys("stefanenered@gmail.com");

        driver.findElement(By.id("u_0_y")).sendKeys("cea mai tare parola");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Sep");
        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByVisibleText("7");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1988");



        driver.findElement(By.id("u_0_7")).click(); // gender select

        driver.findElement(By.id("u_0_15")).submit(); //submit button

        driver.quit();




    }


}
