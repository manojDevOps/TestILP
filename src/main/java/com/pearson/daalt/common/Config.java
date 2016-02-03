package com.pearson.daalt.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {


    private static final long serialVersionUID = 1L;
    private static Properties properties = new Properties();


    public static void load(InputStream inStream) throws IOException {

        properties.load(inStream);
    }


    public static String getProperty(String key) {

        return properties.getProperty(key);
    }

}
