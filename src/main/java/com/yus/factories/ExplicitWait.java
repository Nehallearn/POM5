package com.yus.factories;

import com.yus.constants.FrameworkConstants;
import com.yus.drivers.DriverManager;
import com.yus.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class ExplicitWait {
    private ExplicitWait()
    {

    }

    public static void explicitWait(By by,WaitStrategy waitType)
    {
        if(waitType == WaitStrategy.CLICKABLE) {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getEXPLICITWAITTIMEOUT());
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }else if(waitType == WaitStrategy.VISIBLE)
        {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getEXPLICITWAITTIMEOUT());
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        }else if(waitType == WaitStrategy.PRESENCE)
        {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getEXPLICITWAITTIMEOUT());
            wait.until(ExpectedConditions.presenceOfElementLocated(by));

        }else if(waitType == WaitStrategy.NONE)
        {
            System.out.println("No Explicit wait provided ");
        }

    }

}
