package TestCases;

import org.testng.annotations.Test;

import pageObjects.WendellLandingPage;

public class WendellAddHero extends Base {
	
	@Test
	public void open_page() {
		WendellLandingPage pom = new WendellLandingPage(driver);
		pom.ClickOnHero();
		pom.setName("Buba");
		pom.setAlias("Buba");
		pom.ClickOnHero1();
	}

}
