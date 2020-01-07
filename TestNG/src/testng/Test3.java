package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	SoftAssert softAssert=new SoftAssert();
  @Test
  void demoTest() {
	  softAssert.assertTrue(true); //passed
	  softAssert.assertEquals("welcome", "Welcome"); //false-failed
	  softAssert.assertEquals("selenium", "selenium"); //true - passed
	  System.out.println("Successfully passed");
	  softAssert.assertAll();
	  
  }
}
