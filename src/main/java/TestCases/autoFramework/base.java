package TestCases.autoFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver initDriver() throws IOException
	{
		
		prop= new Properties();
		prop.load(new FileInputStream("src/main/resources/data.properties"));
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	
	}

}
