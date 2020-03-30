import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithCheckboxes extends BaseClass {


    @Test
    public void testThatCheckboxExists() {
        String urlEmagLaptops = "https://www.emag.ro/laptopuri/c?ref=hp_menu_quick-nav_1_1&type=category";
        getDriver().get(urlEmagLaptops);

        WebElement inStocCheckbox = getDriver().findElement(By.xpath("//*[@id=\"js-filter-6407-collapse\"]/div/a[1]"));
        Assert.assertFalse(inStocCheckbox.isSelected());

        WebElement capacitateMemorieRAMSub4RAMCheckbox = getDriver().findElement(By.xpath("//*[@id=\"js-filter-7886-collapse\"]/div/a[1]"));
        Assert.assertTrue(capacitateMemorieRAMSub4RAMCheckbox.isDisplayed());
    }
}
