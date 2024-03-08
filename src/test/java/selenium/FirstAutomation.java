package selenium;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver {
	
	@Test
	public void firstTest() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		
	}

}
