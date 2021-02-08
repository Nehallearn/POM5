package com.yus.tests;
import com.yus.drivers.DriverBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest()
    {

    }

    @BeforeMethod
    public  void setup() throws Exception {
        DriverBase.initDrivers();

    }

    @AfterMethod
    public void tearDown()
    {

        DriverBase.exitDrivers();
    }
}
