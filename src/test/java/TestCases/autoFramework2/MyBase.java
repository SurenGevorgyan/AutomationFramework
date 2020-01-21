package TestCases.autoFramework2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.ConfigReader;

public class MyBase {

	WebDriver driver;
	ConfigReader config;
	
	@BeforeMethod
	public void setupApplication() throws FileNotFoundException, IOException
	{
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		

	}

	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
	}
	
	
	
	
}
