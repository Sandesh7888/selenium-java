package com.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

    WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setup(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
            	if (browser.equalsIgnoreCase("edge")) {
            	    try {
            	        WebDriverManager.edgedriver().setup();   // auto download
            	    } catch (Exception e) {
            	        System.out.println("WebDriverManager failed. Using local driver.");
            	        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            	    }
            	    driver = new EdgeDriver();
            	}

                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login.salesforce.com/");
    }

    @Test
    public void sendData() {
        System.out.println("Title is: " + driver.getTitle());
    }
}
