import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestsGettingInfoFromElements extends BaseClass {

    @Test
    public void getTextExample() {
        //navighez catre www.facebook.com
        getDriver().get("https://www.facebook.com/");


        //imi construiesc un WebElement cu numele emailOrPhoneLabel care va avea calea catre un label din pagina facebook
        WebElement emailOrPhoneLabel = getDriver().findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[1]/td[1]/label"));

        //extrag textul labelulului
        String emailOrPhoneLabelText = emailOrPhoneLabel.getText();

        //al afisez-optional
        System.out.println("textul este " + emailOrPhoneLabelText);

        //imi construiesc un string cu textul pe care ma astept sa il obtin
        String expectText = "Email or Phone";

        //fac asertiunea de egalitate intre cele 2 stringuri
        Assert.assertEquals(emailOrPhoneLabelText, expectText);

    }

    @Test
    public void getAtttributeExample() {
        //navighez catre www.facebook.com
        getDriver().get("https://www.facebook.com/");

        //imi construiesc un WebElement cu numele facebookLogInButton care va avea calea catre un buton din pagina facebook
        WebElement facebookLogInButton = getDriver().findElement(By.id("u_0_b"));

        //extrag textul butonului folosindu-ma de metoda getAttribute si atributul "value" pt elementul web
        String textFacebookLogInButton = facebookLogInButton.getAttribute("value");

        //imi construiesc un string cu textul pe care ma astept sa il obtin
        String expectText = "Log In";

        //fac asertiunea de egalitate intre cele 2 stringuri
        Assert.assertEquals(textFacebookLogInButton, expectText);
    }


    @Test
    public void idDisplayedExample() {
        //navighez catre https://www.ebay.com/
        getDriver().get("https://www.ebay.com/");

        //imi construiesc un WebElement cu numele facebookLogInButton care va avea calea catre un buton din pagina facebook
        WebElement ebaySearchButton = getDriver().findElement(By.id("gh-btn"));

        //fac asertiunea de "existenta" a butonului de search de pe pagina folosindu-ma de raspunsul dat de metoda isDisplayed()
        Assert.assertTrue(ebaySearchButton.isDisplayed());
    }

    @Test
    public void isEnabledExampleTrue() {
        //navighez catre pagina de demos
        getDriver().get("https://www.coderdojoiasi.ro/demos/disabled.html");

        //imi construiesc un WebElement cu numele nameTextInput care va avea calea catre un input field din pagina de demos
        WebElement nameTextInput = getDriver().findElement(By.id("name"));

        //acum vreau sa verific ca input fieldul respectiv este enabled
        Assert.assertTrue(nameTextInput.isEnabled());

        //fac asertiunea de egalitate intre cele 2 stringuri

    }

    @Test
    public void isEnabledExampleFalse() {
        //navighez catre pagina de demos
        getDriver().get("https://www.coderdojoiasi.ro/demos/disabled.html");

        //imi construiesc un WebElement cu numele ageNumberInput care va avea calea catre un input field din pagina de demos
        WebElement ageNumberInput = getDriver().findElement(By.id("age"));

        //fac asertiunea ca rezultatul pe care mi-l returneaza metoda isEnabled() pe inputul meu este fals
        //(pe romaneste - fieldul de input este disabled - si vreau sa verific chestia asta
        Assert.assertFalse(ageNumberInput.isEnabled());
    }
}
