package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elementsWindow.ButtonPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectElements();
        new SidePanel(driver).selectButtons().hideIframes();
    }

    @Test
    public void doubleCLickMeTest(){
        new ButtonPage(driver).doubleClickMe();
    }

    @Test
    public void rightClickTest(){
        new ButtonPage(driver).rightClick();
    }
}
