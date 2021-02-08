package com.yus.constants;

import com.yus.enums.ConfigProperties;
import com.yus.utils.PropertyReader;

public final class FrameworkConstants {
    private FrameworkConstants()
    {

    }
    private static String PROPERTYFILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    private static int EXPLICITWAITTIMEOUT = 30;
    private static String EXCELFILEPATH = System.getProperty("user.dir")+"/src/test/resources/excel/Test.xlsx";
    private static String EXTENTREPORTPATH = System.getProperty("user.dir")+"/test-output-extent/";
    public static String getEXTENTREPORTPATH() throws Exception {
        if(PropertyReader.getPropertyValue(ConfigProperties.DYNAMICREPORT).equalsIgnoreCase("yes"))
        {
            return EXTENTREPORTPATH+"index_"+System.currentTimeMillis()+".html";
        }
        else
        {
            return EXTENTREPORTPATH+"index.html";
        }

    }
    public static String getPROPERTYFILEPATH() {
        return PROPERTYFILEPATH;
    }
    public static int getEXPLICITWAITTIMEOUT() {
        return EXPLICITWAITTIMEOUT;
    }
    public static String getEXCELFILEPATH() {
        return EXCELFILEPATH;
    }

}
