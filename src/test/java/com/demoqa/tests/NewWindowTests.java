package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindow.BrowserWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;

public class NewWindowTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectBrowserWindows();
    }

    @Test
    public void newTabTest(){
        new BrowserWindowsPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("This is a sample page");
    }

    @Test
    public void newWindowTest(){
        new BrowserWindowsPage(driver).switchToNewWindow(1).verifyNewWindowTitle("This is a sample page");
    }
}
