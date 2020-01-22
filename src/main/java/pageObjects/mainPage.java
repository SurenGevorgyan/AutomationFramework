package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {

	public mainPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public WebDriver driver;
	
	By searchbox=By.xpath("//input[@name='q']");
	


	public WebElement getSearchBox()
	{
		return driver.findElement(searchbox);
	}
}
