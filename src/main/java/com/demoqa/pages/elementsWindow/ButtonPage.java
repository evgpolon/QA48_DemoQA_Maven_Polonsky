package com.demoqa.pages.elementsWindow;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage {
    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickBtn;
    public ButtonPage doubleClickMe() {
        new Actions(driver).doubleClick(doubleClickBtn).perform();
        return this;
    }

    @FindBy(id = "rightClickBtn")
    WebElement rightClickBtn;
    public ButtonPage rightClick() {
        new Actions(driver).contextClick(rightClickBtn).perform();
        return this;
    }
}
