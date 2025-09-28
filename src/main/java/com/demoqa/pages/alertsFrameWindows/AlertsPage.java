package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlert;

    public AlertsPage alertWithTimer() {
        clickWithJS(timerAlert,0,300);
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.alertIsPresent()).
                accept();
        return this;
    }
}
