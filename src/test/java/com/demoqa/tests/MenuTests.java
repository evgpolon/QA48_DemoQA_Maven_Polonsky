package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.wigets.MenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWigets();
        new SidePanel(driver).getMenu().hideIframes();
    }

    @Test
    public void moveToMenuTest(){
        new MenuPage(driver).selectSubMenu().verifySubMenu();
    }
}
