package com.yus.tbd;

import com.yus.enums.ConfigProperties;
import com.yus.utils.PropertyReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test1 {

    @Test
    public void testing() throws Exception {
        String a = PropertyReader.getPropertyValue(ConfigProperties.URL);
        System.out.println(a);
    }
}
