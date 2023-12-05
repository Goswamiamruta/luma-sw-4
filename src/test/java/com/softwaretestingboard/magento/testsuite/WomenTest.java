package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();




    @Test
    public void verifyTheSortByProductNameFilter (){
    //1.1 Mouse Hover on Women Menu
    homePage.mouseHoverToWomenMenu();
    //1.2 Mouse Hover on Tops
    homePage.mouseHoverToWomenTops();
    //1.3 Click on Jackets
    homePage.clickOnJackets();
    //1.4 Select Sort By filter “Product Name”
    jacketsPage.selectProductNameFilter("Product Name");

    //1.5 Storing jackets names in list
        Assert.assertEquals(jacketsPage.getProductList1(), jacketsPage.getProductList2());

}
@Test
    public void verifyTheSortByPriceFilter(){
        //2.1  Mouse Hover on Women Menu
        homePage.mouseHoverToWomenMenu();
        //2.2 Mouse Hover on Tops
        homePage.mouseHoverToWomenTops();
        //2.3 Click on Jackets
        homePage.clickOnJackets();
        //2.4 Select Sort By filter “Price”
        jacketsPage.selectProductNameFilter("Price");
        //2.5 Verify the products price display in Low to High
        Assert.assertEquals(jacketsPage.getPriceList1(), jacketsPage.getPriceList2());



}




}





