package com.common;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.main.Main;

public class DataProvider extends Main {
	//locator 
	static By username=By.id("un");
	static By password=By.id("un");
	static By login=By.id("un");
	
  @Test(dataProvider="logindata")
  public void senddata(String un ,String pas) {
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.id("pass")).sendKeys(pas);
	  driver.findElement(By.id("login")).click();
  }
  
  @org.testng.annotations.DataProvider(name="logindata")
  public Object[][] logindata(){
	return new Object[][]{
		{
			"username", "pass"
		},
		{
			"username", "pass"			
		},
		{
			"username", "pass"
		},
		{
			"username", "pass"			
		},
		{
			"username", "pass"
		},
		{
			"username", "pass"			
		},
		{
			"username", "pass"
		},
		{
			"username", "pass"			
		}
	};
	  
  }
}
