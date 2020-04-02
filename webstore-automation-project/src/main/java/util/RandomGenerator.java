package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RandomGenerator {

    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1001);
    }

    public void generateRandomEmailAddress() {

    }

    static void highlightElements(WebDriver driver, WebElement... elements) throws InterruptedException {
        for (WebElement element : elements) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='2px solid red'", element);
        }
        Thread.sleep(2000);
    }
}
