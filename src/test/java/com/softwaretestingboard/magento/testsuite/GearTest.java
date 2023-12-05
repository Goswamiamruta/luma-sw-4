package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    BagPage bagsPage = new BagPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnGearMenu();
        homePage.mouseHoverOnBagsAndClick();
        bagsPage.clickOnOverNightDuffle();
        Assert.assertEquals(overNightDufflePage.getText(),"Overnight Duffle","Text is not displayed");
        overNightDufflePage.changeTheQuantity("3");
        overNightDufflePage.clickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getActualText(),"You added Overnight Duffle to your shopping cart.","Text is not displayed");
        overNightDufflePage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.getName(),"\"Overnight Duffle","Name is not displayed");
        Assert.assertEquals(shoppingCartPage.getQuantity(),3,"Quantity is not displayed");
        Assert.assertEquals(shoppingCartPage.getPrice(),"$135.00","Price is not displayed");
        shoppingCartPage.changeQuantityTo5("5");
        shoppingCartPage.updateShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyProductPrice(),"$225.00","Price is not displayed");
    }
}
