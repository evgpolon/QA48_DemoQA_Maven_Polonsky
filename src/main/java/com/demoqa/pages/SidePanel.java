package com.demoqa.pages;

import com.demoqa.pages.alertsFrameWindow.AlertsPage;
import com.demoqa.pages.alertsFrameWindow.BrowserWindowsPage;
import com.demoqa.pages.alertsFrameWindow.FramePage;
import com.demoqa.pages.bookStoreWindow.LoginPage;
import com.demoqa.pages.elementsWindow.ButtonPage;
import com.demoqa.pages.interactionsWindow.DroppablePage;
import com.demoqa.pages.wigetsWindow.MenuPage;
import com.demoqa.pages.wigetsWindow.SelectMenuPage;
import com.demoqa.pages.wigetsWindow.SliderPage;
import com.demoqa.pages.wigetsWindow.ToolTipsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[.='Login']")
    WebElement login;
    public LoginPage selectLogin() {
        //click(login);
        clickWithJS(login, 0,500);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts() {
        clickWithJS(alerts,0,300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public FramePage selectFrame() {
        clickWithJS(frames, 0, 300);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        clickWithJS(nestedFrames, 0, 300);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJS(browserWindows,0,300);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage getSelectMenu() {
        clickWithJS(selectMenu,0,600);
        return new SelectMenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;
    public MenuPage getMenu() {
        clickWithJS(menu, 0, 600);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;
    public SliderPage selectSlider() {
        clickWithJS(slider, 0, 300);
        return new SliderPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public DroppablePage selectDroppable() {
        clickWithJS(droppable, 0, 600);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;
    public ToolTipsPage selectToolTips() {
        clickWithJS(toolTips,0,600);
        return new ToolTipsPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;
    public ButtonPage selectButtons() {
        click(buttons);
        return new ButtonPage(driver);
    }
}
