import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Util extends BaseClass {

    public static boolean isAlertPresent(Alert alert) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 3 /*timeout in seconds*/);
        if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
            System.out.println("alert was not present");
            return false;
        } else {
            return true;
        }
    }


}
