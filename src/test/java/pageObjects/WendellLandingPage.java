package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WendellLandingPage {
	WebDriver driver;
    public WendellLandingPage(WebDriver driver){ 
             this.driver=driver; 
             PageFactory.initElements(this.driver, this);
    }
    
	@FindBy(how=How.XPATH, using="//button[@class='my-3 btn btn-primary']") WebElement heroButton;

	public void ClickOnHero() {
		
		heroButton.click();
	}
	
}
