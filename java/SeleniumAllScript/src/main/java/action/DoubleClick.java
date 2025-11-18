package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    WebDriver driver;
    Actions act;
    
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);

        act = new Actions(driver);
    }

    public void doubleClick() throws InterruptedException {

        // Locate the element for double click
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        // Perform double click
        act.doubleClick(doubleClickBtn).perform();

        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        DoubleClick obj = new DoubleClick();
        obj.launch();
        obj.doubleClick();
    }
}
