import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTests2 extends BaseClass {

    @Test
    public void getTextExample() {
        //2. navigam catre www.facebook.com
        getDriver().get("https://www.facebook.com/"); // browserul ma va directa catre facebook.com

        WebElement facebookSignUpButton = getDriver().findElement(By.id("u_0_13"));
        String textFacebookSignUpButton = facebookSignUpButton.getAttribute("InnerText");
        System.out.println("textul este " + textFacebookSignUpButton);
//        String expectText = "Sign Up";
//        Assert.assertEquals(textFacebookSignUpButton,expectText);

    }
}
