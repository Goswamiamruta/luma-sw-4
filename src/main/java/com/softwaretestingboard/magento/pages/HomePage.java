package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By womenTops = By.xpath("//a[@id='ui-id-9']");
    By womenJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
   // By finalPrice = By.cssSelector("span[data-price-type='finalPrice']");
   By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverToWomenMenu() {

        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverToWomenTops() {

        mouseHoverToElement(womenTops);
    }

    public void clickOnJackets() {
        clickOnElement(womenJackets);

    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(pants);
    }


    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void mouseHoverOnBagsAndClick(){
        mouseHoverToElementAndClick(bags);
    }
}

