package com.yus.utils;

import com.yus.constants.FrameworkConstants;
import com.yus.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;

public class PropertyReader {


    public static String  getPropertyValue(ConfigProperties key) throws Exception {
        Properties propoerties = new Properties();
        FileInputStream fis = new FileInputStream(FrameworkConstants.getPROPERTYFILEPATH());
        propoerties.load(fis);

        if(Objects.isNull(propoerties.getProperty(key.name().toLowerCase())) || (Objects.isNull(key)))
        {
            throw new Exception("Please check property file for the provide key: "+key.name().toLowerCase());

        }
        return propoerties.getProperty(key.name().toLowerCase());



    }
}
