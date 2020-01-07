package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {
	
	SoftAssert softAssert=new SoftAssert();
	
  @Test
  void demoTest1() {
  softAssert.assertEquals("welcome", "wel"); //false;
  softAssert.assertAll();
  }
  
  @Test
  void demoTest2() {
	  softAssert.assertEquals("welcome", "welcome"); //true passed
	  softAssert.assertAll();
  }
  
}
//oba testa su fail zato sto je to karakteristika softAsserta, koristi se isti objekat
//softAssert i kada prvi test pada pada i drugi
//resava se kreiranjem softAssert2 objektom