package com.common;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.scripts.Amzon_Script;

public class Amzon_Common extends Amzon_Script{
	
	
	static By SearchBar=By.id("twotabsearchtextbox");
	static By SearchButton=By.id("nav-search-submit-button");
	@Test
	public static void SendData() {
		driver.findElement(SearchBar).sendKeys("i phone 17");
		driver.findElement(SearchButton).click();
	}
	

} 