package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownKeyExample {

    WebDriver driver;
    Actions act;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        act = new Actions(driver);
    }

    public void pressDownKey() throws InterruptedException {

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        Thread.sleep(2000); // wait for suggestions

        // Press DOWN key 3 times
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(500);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(500);
        act.sendKeys(Keys.ARROW_DOWN).perform();

        // Press ENTER to select
        act.sendKeys(Keys.ENTER).perform();

        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        DownKeyExample obj = new DownKeyExample();
        obj.launch();
        obj.pressDownKey();
    }
}
