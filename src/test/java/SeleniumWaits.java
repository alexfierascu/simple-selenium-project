import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWaits extends BaseClass {

    @Test
    public void implicitWaitTest() {


      String urlFainaAKAAurulAlbInTimesOfCoronaVirusEmag = "https://www.emag.ro/faina-neagra-de-grau-tip-1250-baneasa-1kg-45270311/pd/D0LY5BMBM/?X-Search-Id=d25a685ee0a7c590b0d6&X-Product-Id=6472108&X-Search-Page=1&X-Search-Position=2&X-Section=search&X-MB=0&X-Search-Action=view";
        getDriver().get(urlFainaAKAAurulAlbInTimesOfCoronaVirusEmag);
        WebDriverWait wait = new WebDriverWait(getDriver(),5);
        wait.until(ExpectedConditions.titleIs("Faina neagra de grau tip 1250 Baneasa, 1kg - eMAG.ro"));
    }


    @Test
    public void explicitWaitTest() throws InterruptedException {
        String urlWallMountForAlexaFromAmazonShop = "https://www.amazon.com/Generation-Google-Holder-Management-Accessories/dp/B07X289WHV/ref=sr_1_2?crid=1YLW3MLSTV7V7&keywords=alexa+echo&qid=1585589365&sprefix=alexa%2Caps%2C349&sr=8-2";
        getDriver().get(urlWallMountForAlexaFromAmazonShop);

        WebElement numberOfReviews = getDriver().findElement(By.id("acrCustomerReviewText"));
        String actualNoOfReviews = numberOfReviews.getText();
        System.out.println("numarul de reviews este " +actualNoOfReviews );
        Thread.sleep(20000);
        Assert.assertEquals(actualNoOfReviews,"72 ratings");
        //todo
        //documentatie explicit waits - avantaje/ dezavantaje
    }
}
