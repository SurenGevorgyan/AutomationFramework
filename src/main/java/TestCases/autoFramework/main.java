package TestCases.autoFramework;

import java.io.FileNotFoundException;
import java.io.IOException;

public final class main extends base{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		initDriver();
		driver.get("https://gmail.com");
		
	}

}
