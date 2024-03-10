package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseDriver {

	@Test
	public void testLocator() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/");
//		driver.get("https://member.daraz.com.bd/user/login");
		Thread.sleep(5000);
		
//		//By ID
//		WebElement bus = driver.findElement(By.id("purpose"));
//		bus.click();
//		Thread.sleep(5000);
		
//		//By Name
//		WebElement bus = driver.findElement(By.name("purpose"));
//		bus.click();
//		Thread.sleep(5000);
//		
//		//By link
//		WebElement launch = driver.findElement(By.linkText("Launch"));
//		launch.click();
//		Thread.sleep(5000);
		
		//By class
//		WebElement submit = driver.findElement(By.className("next-btn"));
//		submit.click();
//		Thread.sleep(5000);
		
//		WebElement submit = driver.findElement(By.className("btn"));
//		submit.click();
//		Thread.sleep(5000);
		
		/*//Custom xpath -> 
		*  //tagName[@attribute='value']
		*  //tagName[contains(text(),'text']
		*  //*[contains(text(),'text']
		*  //form[@id='form_contact_us']/div[3]/div[1]/label/span
		*
		*/
		
		//By xpath
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("test@nomail.com");
//		Thread.sleep(5000);
		
		//By partial Link
//		WebElement contact = driver.findElement(By.partialLinkText("Contact"));
//		contact.click();
//		Thread.sleep(4000);
		
		//css -> elementName [attributeName='attributeValue']
		
		//by css selector
		WebElement name = driver.findElement(By.cssSelector("input[name='dest_form']"));
		name.sendKeys("Nothing");
		Thread.sleep(3000);
				
		
		
	}

}
