import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    private static WebDriver driver;

    @BeforeClass
    public static void driverSetup() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void baseAfter() {
        driver.close();
    }

    @AfterSuite
    public static void baseAfterClass() {
        driver.quit();
    }

}
