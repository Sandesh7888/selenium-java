package com.main;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Main {
	
	public static WebDriver driver;
	
	String url="https://www.amazon.in/";
		
	@BeforeMethod
	public void launch() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void Close() {
		driver.quit();
	}
}
