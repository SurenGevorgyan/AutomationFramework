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
	@FindBy(how=How.XPATH, using="//input[@id='name']") WebElement NameText;
	@FindBy(how=How.XPATH, using="//input[@id='alias']") WebElement AliasText;
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-primary']") WebElement heroButton1;
	public void ClickOnHero() {
		
		heroButton.click();
	}
	
	public void setName(String Buba){
		 NameText.sendKeys("Buba");
}
	public void setAlias(String Buba){
		 AliasText.sendKeys("Buba");

}
	public void ClickOnHero1() {
		
		heroButton1.click();
	
}
}
