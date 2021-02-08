package com.yus.pages;

import com.yus.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class RegisterPage extends BasePage{

    private  By registerFirstNameelement = By.xpath("//input[@id='customer_firstname']");
    private  By registerLastNameelement = By.xpath("//input[@id='customer_lastname']");
    private  By registerEmailelement = By.xpath("//input[@id='email']");
    private  By registerPasswordelement = By.xpath("//input[@id='passwd']");

    public String getRegisterPageTitle()
    {
        return doGetPageTitle();
    }
    public RegisterPage registerEnterFirstName(String firstname)
    {
        doSendKeys(registerFirstNameelement,firstname, WaitStrategy.VISIBLE,"First Name Field in New User registration");
        return this;

    }
    public RegisterPage registerEnterLastName(String lastname)
    {
        doSendKeys(registerLastNameelement,lastname,WaitStrategy.VISIBLE,"Last Name Field in New User registration");
        return this;

    }
    public RegisterPage registerEnterEmail(String email)
    {
        doSendKeys(registerEmailelement,email,WaitStrategy.VISIBLE,"Email Field in New User registration");
        return this;

    }
    public RegisterPage registerEnterPassword(String password)
    {
        doSendKeys(registerPasswordelement,password,WaitStrategy.VISIBLE,"Password Field in New User registration");
        return this;

    }
}
