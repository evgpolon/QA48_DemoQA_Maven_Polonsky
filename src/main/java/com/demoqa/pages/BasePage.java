package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);

    }
    public void click (WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        if(text!=null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void clickWithJS(WebElement element, int x, int y){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        click(element);
    }
}
