package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //1.1 Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        Thread.sleep(1000);
        //1.2 Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();
        Thread.sleep(1000);
        //1.3 Click on Pants
        homePage.clickOnPants();
        Thread.sleep(1000);
        //1.4 Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.clickOnSize32();
        //1.5Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        pantsPage.clickOnBlackColour();
        pantsPage.clickOnAddToCart();
        //1.6 Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(pantsPage.getActualText(),"You added Cronus Yoga Pant to your shopping cart.","Text is not displayed");
        pantsPage.clickOnShoppingCartLink();
        //1.7 Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getActualText(),"Shopping Cart","Text is not displayed");
        //1.8 Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getProductName(),"Cronus Yoga Pant","Product name is not displayed");
        //1.9 Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.getSize(),32,"Size is not displayed");
        //1.10 Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getColour(),"Black","Colour is not displayed");
    }
}
