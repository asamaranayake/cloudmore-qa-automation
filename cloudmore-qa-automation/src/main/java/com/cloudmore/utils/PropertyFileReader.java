package com.cloudmore.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
    // Singleton instance
    private static PropertyFileReader instance = null;

    // Properties to load the property values
    private static Properties prop = new Properties();

    private PropertyFileReader() {
    }

    /**
     * Method to return the singleton instance of property reader If there is no
     * existing instance a instance is created and returned
     *
     * @return property reader
     */
    public static PropertyFileReader getInstance() {
        if (instance == null) {
            synchronized (PropertyFileReader.class) {
                if (instance == null) {
                    instance = new PropertyFileReader();
                    loadApplicationPropertyFile();
                }
            }
        }
        return instance;
    }

    public void setProp(String key, String value) {
        if (instance != null)
            prop.setProperty(key, value);
    }

    /**
     * Method to read and return the property value from the file
     *
     * @param key property name
     * @return property value corresponding to the key
     */
    public String getProperty(String key) {
        return prop.getProperty(key);
    }

    /**
     * Function responsible for loading the application.properties file
     */
    private static void loadApplicationPropertyFile() {
        InputStream input = instance.getClass().getClassLoader().getResourceAsStream("application.properties");
        try {
            prop.load(input);
        } catch (IOException e) {
            //LoggerUtils.error("Error in property reader class {} {} " + e.getMessage());
        }
    }
}
