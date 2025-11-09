package com.qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDemo {
	
    // Declare WebDriver at class level so all methods can use it
    WebDriver driver;
	
    public void launch() throws InterruptedException {
        // Initialize driver
        driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print title
        System.out.println("Page title is: " + driver.getTitle());
	        
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }
	
    public void checkTitle() {
        String expected = "Google";
        String actual = driver.getTitle();

        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("✅ Title matched: " + actual);
        } else {
            System.out.println("❌ Title mismatch! Expected: " + expected + ", but got: " + actual);
        }
    }
	
    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        SecondDemo s = new SecondDemo();
        s.launch();
        s.checkTitle();
        s.closeBrowser();
    }
}
