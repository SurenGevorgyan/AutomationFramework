package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public ConfigReader()
	{
		prop= new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/data.properties"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public String getBrowserName()
	{
		return prop.getProperty("browser");
	}
	
	public String getURLName()
	{
		return prop.getProperty("url");
	}

}
