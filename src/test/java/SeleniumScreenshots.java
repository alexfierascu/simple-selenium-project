import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class SeleniumScreenshots extends BaseClass {

    @Test
    public void basicScreenshot() throws Exception {
        String urlEmag = "https://www.emag.ro";
        getDriver().get(urlEmag);
        try {
            WebElement elementRandom = getDriver().findElement(By.id("id_plesneala"));
        } catch (Exception e) {
            System.out.println("Elementul nu a fost gasit");
            File screenshotFailEmag = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFailEmag, new File("C:\\proiecte 2\\selenium-example\\src\\test\\failed tests\\screenshots\\screenshot.png"));
        }
    }

    //todo
    //generat nume fisier screenshot in mod dinamic (titlul imaginii sa fie de formatul:
    // zi-luna-an-hh-mm-ss)
    //eg: 31-03-2020-20-12-30.png(jpg/bmp)
    @Test
    public void basicScreenshot2() throws Exception {
        String urlEmag = "https://www.ebay.com";
        getDriver().get(urlEmag);
        try {
            WebElement elementRandom = getDriver().findElement(By.id("id_plesneala"));
        } catch (Exception e) {
            System.out.println("Elementul nu a fost gasit");
            File screenshotFailEmag = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFailEmag, new File("C:\\proiecte 2\\selenium-example\\src\\test\\failed tests\\screenshots\\screenshot.png"));
        }
    }
}
