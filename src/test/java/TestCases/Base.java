package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

public static WebDriver driver;
public static Properties prop;


	@BeforeSuite
	public void GetParameters() {
	
		prop= new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/data.properties"));
		} catch (Exception e) {
			System.out.println("Fili het problem ka");
		}
	}
	
	@BeforeTest
	public void DriverInit() throws IOException{
		
		if(prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
		
			prop= new Properties();
			try {
				prop.load(new FileInputStream("src/main/resources/data.properties"));
			} catch (Exception e) {
				System.out.println(e);
			}
	   }
		
		if(prop.getProperty("browser").equals("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
	        driver=new FirefoxDriver();
			driver.manage().window().maximize();
		
			prop= new Properties();
			try {
				prop.load(new FileInputStream("src/main/resources/data.properties"));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		driver.get("http://wendellsystems.com/");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	
	@AfterSuite
	public void TeardownTest()
    {
		driver.close();
        
    }
}
