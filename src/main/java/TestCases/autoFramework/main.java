package TestCases.autoFramework;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import pageObjects.mainPage;

public final class main extends base{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		initDriver();
		driver.get("https://google.com");
		mainPage l = new mainPage(driver);
		l.getSearchBox().sendKeys("googleme");
	}

}
