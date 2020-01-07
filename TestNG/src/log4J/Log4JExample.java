package log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4JExample {

	public static void main(String[] args) {

		//create logger instance so we can pass Class name
		
		Logger logger=Logger.getLogger("Log4JExample");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vladan Jovanovic\\Downloads\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		
		
		logger.info("Browser opened");
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		logger.info("Clicked on Register");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		logger.info("Entering contact information");
		driver.findElement(By.name("firstName")).sendKeys("Vladan");
		driver.findElement(By.name("lastName")).sendKeys("Jovanovic");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("userName")).sendKeys("fts159@gmail.com");
		
		logger.info("Entering mailing information");
		
		driver.findElement(By.name("address1")).sendKeys("Stevana Dukica 25");
		driver.findElement(By.name("address2")).sendKeys("Dimitrija Davidovica 26B");
		driver.findElement(By.name("city")).sendKeys("Belgrade");
		driver.findElement(By.name("state")).sendKeys("Serbia");
		driver.findElement(By.name("postalCode")).sendKeys("11060");

		logger.info("Selecting country");
	
		Select dropcountry = new Select(driver.findElement(By.name("country")));
		dropcountry.selectByVisibleText("SERBIA");
		
		logger.info("Entering user information");

		driver.findElement(By.name("email")).sendKeys("training");
		driver.findElement(By.name("password")).sendKeys("kototamopeva");
		driver.findElement(By.name("confirmPassword")).sendKeys("kototamopeva");
		
		logger.info("Clicking on register link");
		driver.findElement(By.name("register")).click();
		
		logger.info("Validation started");
		
		if(driver.getPageSource().contains("Thank you for registering")) {
			System.out.println("You registered successfully - TEST PASSED");
			logger.info("Validation DONE");
		} else {
			System.out.println("Your registration failed - TEST FAILED");
			logger.info("Validation DONE");
		}
		
		logger.info("Exit Test");
		
		driver.quit();
		
		
		
		
	}

}
