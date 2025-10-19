package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.wigetsWindow.SliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWigets();
        new SidePanel(driver).selectSlider().hideIframes();
    }

    @Test
    public void sliderTest(){
        new SliderPage(driver).moveSliderInHorizontalDirection()
                .verifySliderValue("100");
    }
}
