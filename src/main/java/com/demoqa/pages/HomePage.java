package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".card:nth-child(6)")
    WebElement bookStore;

    public SidePanel getBookStore() {
        click(bookStore);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindow;

    public SidePanel getAlertsFrameWindows() {
        clickWithJS(alertsFrameWindow,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(4)")
    WebElement widgets;
    public SidePanel getWigets() {
        clickWithJS(widgets,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(5)")
    WebElement interactions;
    public SidePanel getInteractions() {
        click(interactions);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(1)")
    WebElement elements;
    public SidePanel selectElements() {
        click(elements);
        return new SidePanel(driver);
    }
}
