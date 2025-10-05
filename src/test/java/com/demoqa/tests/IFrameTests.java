package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindow.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
    }

    @Test
    public void iFrameTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames()
             .switchToIFrameByIndex(2).verifyIFrameByText("This is a sample page");
    }

    @Test
    public void iFrameTest2(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).switchToIFrameByID()
                .verifyIFrameByText("This is a sample page")
                .switchToMainPage()
                .verifyMainPageByTitle("Frames");
    }

    @Test
    public void nestedFrameTest2(){
        new SidePanel(driver).selectNestedFrames();
        new FramePage(driver).handleNestedFrames();
    }



}
