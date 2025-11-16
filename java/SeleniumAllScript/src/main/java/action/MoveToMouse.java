package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToMouse {

    WebDriver driver;
    Actions act;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        act = new Actions(driver);
    }

    public void mouseHover() throws InterruptedException {

        // Find the element to hover
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

        // Move mouse to element
        act.moveToElement(accountList).perform();

        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        MoveToMouse obj = new MoveToMouse();
        obj.launch();
        obj.mouseHover();
    }
}
