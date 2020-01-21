package TestCases.autoFramework2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestCases.autoFramework2.*;

public class LoadPage extends MyBase {
	
	@Test
    public void initDriver() {
	driver.get(config.getURLName());
	
  }
}
