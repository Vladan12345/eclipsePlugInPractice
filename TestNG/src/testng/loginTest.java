package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vladan Jovanovic\\Downloads\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://newtours.demoaut.com/");
	  
		WebElement usernametxt=driver.findElement(By.name("userName"));
		WebElement passwordtxt=driver.findElement(By.name("password"));
		
		//test will only continue fi the below statement is true
		
		Assert.assertTrue(usernametxt.isDisplayed());
		usernametxt.sendKeys("mercury");
		
		Assert.assertTrue(passwordtxt.isDisplayed());
		passwordtxt.sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		//validation
		
		String exptitle="Find a Flight: Mercury Tours:";
		Assert.assertEquals(exptitle, driver.getTitle()); //compares both titles
		
		driver.close();
		
  }
}
