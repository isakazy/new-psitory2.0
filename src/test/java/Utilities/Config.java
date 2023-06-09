package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;
    static{
        try{
            properties = new Properties();
            FileInputStream file = new FileInputStream("C:\\Users\\isaka\\Test2.0\\src\\test\\resources\\configuration.properties");
            properties.load(file);
        }
        catch (IOException e ){
            System.out.println("file not found ");
        }

    }
    public static String getValue(String key){
        return properties.getProperty(key);
    }
}
