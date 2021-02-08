package com.yus.tests;
import com.yus.pages.LandingPage;
import com.yus.reportutil.ExtentReportBase;
import com.yus.utils.ExcelReader;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;

public final class LoginPageTest extends BaseTest {
    private LoginPageTest()
    {

    }
    LandingPage landingPage = new LandingPage();

    @Test
    public void checkLoginPageTitle()
    {

        String logingpagetitle = landingPage.navigateToLoginPage().getLoginPageTitle();
        System.out.println("Login page title is foudn as: "+logingpagetitle);
        Assertions.assertThat(logingpagetitle).isEqualTo("Login - My Store");


    }

    @Test(dataProvider = "Dummy1")
    public  void checkLoggedInUser(String email,String password)
    {
       // String email = "test321@testing.com";
        //String password = "India321";
        landingPage.navigateToLoginPage().loginEnterUserName(email).loginEnterPassword(password).loginClickonLoginButton();
    }

    @DataProvider(name="Dummy1")
    public static Object[][] getData() throws IOException {

        Object[][] data = ExcelReader.getExceDataintwodObjects("Login");
        return data;

    }
}
