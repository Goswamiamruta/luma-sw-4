package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By colourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By actualText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize32(){
        mouseHoverToElementAndClick(size32);
    }
    public void clickOnBlackColour(){
        clickOnElement(colourBlack);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getActualText(){
        return getTextFromElement(actualText);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
}
