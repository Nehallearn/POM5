package com.yus.pages;

import com.yus.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage{

    private By loginpageUserNameElement = By.xpath("//input[@id='email']");
    private By loginpagePasswordElement = By.xpath("//input[@id='passwd']");
    private By loginpageSigninbuttonElement = By.xpath("//span[normalize-space()='Sign in']");
    private By loginpageCreateuserEmailElement = By.xpath("//input[@id='email_create']");
    private By loginpageCreateuserButtonElement = By.xpath("//span[normalize-space()='Create an account']");

    public String getLoginPageTitle()
    {
        return doGetPageTitle();
    }
    public LoginPage loginEnterUserName(String username)
    {
        doSendKeys(loginpageUserNameElement,username, WaitStrategy.VISIBLE,"UserName Field in Login Page");
        return this;

    }
    public LoginPage loginEnterPassword(String password)
    {
        doSendKeys(loginpagePasswordElement,password,WaitStrategy.VISIBLE,"Password Field in Login Page");
        return this;


    }
    public void loginClickonLoginButton()
    {
        doClick(loginpageSigninbuttonElement,WaitStrategy.CLICKABLE,"Login button in Login Page");


    }
    public LoginPage loginEnterEmailforNewContact(String email)
    {
        doSendKeys(loginpageCreateuserEmailElement,email,WaitStrategy.VISIBLE,"Email Field in Login Page for New User registration");
        return this;

    }
    public RegisterPage loginClickonCreateContactButton()
    {
        doClick(loginpageCreateuserButtonElement,WaitStrategy.CLICKABLE,"Create New Contact Button in Login Page");

        return new RegisterPage();

    }


}
