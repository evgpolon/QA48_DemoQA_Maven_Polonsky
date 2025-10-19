package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.wigetsWindow.ToolTipsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWigets();
        new SidePanel(driver).selectToolTips().hideIframes();
    }

    @Test
    public void toolTipsTest(){
        new ToolTipsPage(driver).hoverToolTips().vefifyToolTips("buttonToolTip");
    }
}
