import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAlertsSelenium extends BaseClass {

    @Test
    public void checkThatAlertIsDisplayedOnSpecificPage() {
        String urlSpecifiPage = "https://www.hyrtutorials.com/p/alertsdemo.html";
        getDriver().get(urlSpecifiPage);

        WebElement alertBoxButton = getDriver().findElement(By.id("alertBox"));
        alertBoxButton.click();

        Alert simpleAlert = getDriver().switchTo().alert();
        Assert.assertEquals(simpleAlert.getText(), "I am an alert box!");


        //inchid alerta (apas OK)
        simpleAlert.accept();

       Assert.assertFalse(Util.isAlertPresent(simpleAlert));

        //todo
        //test de verificat ca s-a inchis alerta
        //de facut o metoda prin care verificam daca o alerta este inchisa. alerta o trimitem ca parametru la metoda noastra
        //eg: verificareCaSaInchisAlerta(simpleAlert);
    }
}
