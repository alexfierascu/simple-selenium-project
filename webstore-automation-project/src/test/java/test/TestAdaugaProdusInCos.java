package test;

import org.testng.annotations.Test;
import pageAction.MainPageActions;
import pageAction.PromotionsPageActions;

import static pageAction.MainPageActions.accesarePaginaPromotii;
import static pageAction.PromotionsPageActions.checkDetailsForFistProductInPromotionsPage;
import static setup.DriverSetup.getDriver;

public class TestAdaugaProdusInCos {

    @Test
    public void checkThatUnregisteredUserCanAddAPromotionProductToCart(){
        getDriver().get("https://www.depurtat.ro/");
        accesarePaginaPromotii();
        checkDetailsForFistProductInPromotionsPage();
    }

}
