package javascriptExecuter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshPage {

    WebDriver driver;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }

    public void refreshPage() throws InterruptedException {

        // Method 1: Navigate refresh
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Method 2: Reload URL
        driver.get(driver.getCurrentUrl());
        Thread.sleep(2000);

        // Method 3: JavaScript refresh
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("location.reload()");
        Thread.sleep(2000);

        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        RefreshPage obj = new RefreshPage();
        obj.launch();
        obj.refreshPage();
    }
}
