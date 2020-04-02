package pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static setup.DriverSetup.getDriver;

public class PromotionsPageActions {

    public static void checkDetailsForFistProductInPromotionsPage() {
        Actions action = new Actions(getDriver());
        WebElement primulProdusVeziDetaliiButton = getDriver().findElement(By.xpath("//*[@id=\"page_content\"]/div[5]/div/div[1]/div/div[2]/div[3]/a[1]"));
        action.moveToElement(primulProdusVeziDetaliiButton).click().build().perform();

    }
}
