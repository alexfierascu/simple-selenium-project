import lombok.extern.slf4j.Slf4j;
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

    @Test
    public void checkThat5StarRatingFilterWorksOnLaptopsCategory() throws InterruptedException {
        //1. prima data verific daca este bifat checkbox-ul
        //2.
        String urlEmagLaptops = "https://www.emag.ro/laptopuri/c?tree_ref=2172&ref=cat_tree_91";
        getDriver().get(urlEmagLaptops);

        WebElement fiveStarRatingFilter = getDriver().findElement(By.xpath("//*[@id=\"js-filter-6419-collapse\"]/div/a[1]"));

        if (fiveStarRatingFilter.isSelected()) {
            System.out.println("Checkboxul este deja activat");
        } else {
            fiveStarRatingFilter.click();
            System.out.println("Am bifat 5 star rating");
            Thread.sleep(7000);
            WebElement emagFiltersActivated = getDriver().findElement(By.xpath("//*[@id=\"page-skin\"]/div[2]/di]/div[2]/div[5]/"));

            //todo -alex logs
            Assert.assertTrue(emagFiltersActivated.isDisplayed());

        }
    }
}
