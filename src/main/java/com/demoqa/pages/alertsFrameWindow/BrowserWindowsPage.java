package com.demoqa.pages.alertsFrameWindow;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "tabButton")
    WebElement tabButton;

    public BrowserWindowsPage switchToNewTab(int index) {
        click(tabButton);
        return this;
    }
}
