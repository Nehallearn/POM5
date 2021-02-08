package com.yus.pages;

import com.yus.drivers.DriverManager;
import com.yus.enums.WaitStrategy;
import com.yus.factories.ExplicitWait;
import com.yus.reportutil.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected  void doClick(By by, WaitStrategy waitStrategy,String elementName)
    {
        ExplicitWait.explicitWait(by,waitStrategy);
        DriverManager.getDriver().findElement(by).click();
        ExtentLogger.info(elementName+" is clicked successfully");


    }
    protected  void doSendKeys(By by,String value,WaitStrategy waitStrategy,String elementName)
    {
        ExplicitWait.explicitWait(by,waitStrategy);
        DriverManager.getDriver().findElement(by).clear();
        DriverManager.getDriver().findElement(by).sendKeys(value);
        ExtentLogger.info("Values enterd in the "+elementName);

    }
    protected String doGetTextValue(By by,WaitStrategy waitStrategy,String elementName)
    {
        ExplicitWait.explicitWait(by,waitStrategy);
        String text = DriverManager.getDriver().findElement(by).getText();
        ExtentLogger.info("Text extracted successfully for the  "+elementName);
        return text;
    }
    protected String doGetPageTitle()
    {
        return DriverManager.getDriver().getTitle();
    }
    protected boolean doCheckLogoDisplay(By by,WaitStrategy waitStrategy,String elementName)
    {
        ExplicitWait.explicitWait(by,waitStrategy);
        ExtentLogger.info("Logo validation is suvccesfull "+elementName);
        return DriverManager.getDriver().findElement(by).isDisplayed();
    }


}
