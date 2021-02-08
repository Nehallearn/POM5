package com.yus.pages;

import com.yus.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class LandingPage extends BasePage{

    private By logoElement = By.xpath("//img[@alt='My Store']");
    private By signInLinkElement = By.xpath("//a[normalize-space()='Sign in']");

    public String getLandingPageTitle()
    {
        return doGetPageTitle();
    }
    public boolean getLandingPageLogo()
    {
        return doCheckLogoDisplay(logoElement, WaitStrategy.VISIBLE,"Landing page Logo");
    }
    public LoginPage navigateToLoginPage()
    {
        doClick(signInLinkElement,WaitStrategy.CLICKABLE,"Login page Navigation Button");
        return new LoginPage();
    }



}
