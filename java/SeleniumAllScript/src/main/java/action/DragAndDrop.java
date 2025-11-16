package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
		WebDriver driver;
		Actions act; 	
		public void launch() throws InterruptedException {
			driver=new ChromeDriver();
			 driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(2000);

			driver.manage().window().maximize();
		
		
			
		    
		}
		
		public void DragAndDrop() throws InterruptedException {

	        // Switch to frame (very important!)
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	        // Locate source and target elements
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("droppable"));

	         act = new Actions(driver);

	        // Perform drag and drop
	        act.dragAndDrop(source, target).perform();

	        System.out.println("Drag and Drop successful!");

	        Thread.sleep(3000);
	        driver.quit();
	    
		}


	    public static void main(String[] args) throws InterruptedException {
	    	
	    	DragAndDrop d=new DragAndDrop();
	    	d.launch();
	    	d.DragAndDrop();


	    }
}