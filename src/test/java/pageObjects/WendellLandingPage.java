package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WendellLandingPage {
	WebDriver driver;
    public WendellLandingPage(WebDriver driver){ 
             this.driver=driver; 
    }
    
	@FindBy(how=How.XPATH, using="//input[@name='q']") WebElement google;

	public void google(){
		google.sendKeys("aaaaa");
	}
}
