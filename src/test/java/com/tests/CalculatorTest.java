package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CalculatorPage;

public class CalculatorTest {
	
	CalculatorPage calPage;
	
	@BeforeMethod
	public void setup() {
		calPage= new CalculatorPage();
		
		
	}
	
	@Test
	public void doSum() {
		String res=calPage.doSum("20", "30");
		//Assert.assertEquals(res, 50);
		Assert.assertEquals(res, 50);

}
}