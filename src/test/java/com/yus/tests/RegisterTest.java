package com.yus.tests;
import com.yus.pages.LandingPage;
import com.yus.reportutil.ExtentLogger;
import com.yus.reportutil.ExtentReportBase;
import com.yus.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Map;

public final class RegisterTest extends BaseTest{
    private RegisterTest()
    {

    }
    LandingPage landingPage = new LandingPage();

    @Test(dataProvider = "Dummy2")
    public void registerTest(Map<String,String> map)
    {
       // String email = "test322@testing.com";
        //String firstname = "FirstNameOne";
        //String lastname = "lastnameone";
        //String password = "India321";
        String email = map.get("email");
        String firstname = map.get("firstname");
        String lastname = map.get("lastname");
        String password = map.get("password");
        landingPage.navigateToLoginPage()
                .loginEnterEmailforNewContact(email).loginClickonCreateContactButton()
                .registerEnterFirstName(firstname).registerEnterLastName(lastname).registerEnterEmail(email)
                .registerEnterPassword(password);
        ExtentLogger.info("hello infor for extent report");

    }
    @Test
    public void registerPageTitle()
    {
        String email = "test322@testing.com";
        String title = landingPage.navigateToLoginPage()
                .loginEnterEmailforNewContact(email).loginClickonCreateContactButton()
                .getRegisterPageTitle();
        System.out.println("Register page title is :   "+title);
        ExtentLogger.info("hi infor for extent report");
    }
    @DataProvider(name="Dummy2")
    public static Object[] getData() throws IOException {

        Object[] data = ExcelReader.getExcelDatawithMapObjects("Register");

        return data;

    }
}
