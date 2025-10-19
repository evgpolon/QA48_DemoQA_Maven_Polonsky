package com.demoqa.pages.interactionsWindow;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DroppablePage extends BasePage {
    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;
    @FindBy(id = "droppable")
    WebElement dropHere;


    public DroppablePage actionDragMe() {
        pause(1000);
        moveWithJS(0,200);
        new Actions(driver).dragAndDrop(dragMe,dropHere).perform();
        return this;
    }


    public DroppablePage verifyDropped(String text) {
        Assert.assertTrue(shouldHaveText(dropHere,text,6));
        return this;
    }

    public DroppablePage dragAndBy(int x, int y) {
        pause(1000);
        moveWithJS(0,200);
        // get coordinate dragMe and print
        int xOffset1 = dragMe.getLocation().getX();
        int yOffset1 = dragMe.getLocation().getY();
        System.out.println("xOffset1 --> " + xOffset1 + "yOffset1 -->" + yOffset1);
        // get coordinate dropHere and print
        int xOffset2 = dropHere.getLocation().getX();
        int yOffset2 = dropHere.getLocation().getY();
        System.out.println("xOffset2 --> " + xOffset2 + "yOffset2 -->" + yOffset2);
        //find the difference xOffset and yOffset
        int xOffset = (xOffset2-xOffset1)+x;
        int yOffset = (yOffset2-yOffset1)+y;
        new Actions(driver).dragAndDropBy(dragMe,xOffset,yOffset).perform();
        return this;
    }
}
