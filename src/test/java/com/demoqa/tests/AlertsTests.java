package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindow.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//hello meow meow

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void alertWaitTest(){
        new AlertsPage(driver).alertWithTimer();
    }

    @Test
    public void alertWithSelectTest(){
        new AlertsPage(driver).selectResult("Cancel").veryfiResult("Cancel");
    }
}
