package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	   WebDriver driver;
	    Actions act;

	    public void launch() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	        Thread.sleep(2000);

	        act = new Actions(driver);
	    }

	    public void rightClick() throws InterruptedException {

	        // Locate the element on which we need to perform right click
	        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

	        // Perform right-click
	        act.contextClick(rightClickBtn).perform();

	        Thread.sleep(2000);
	        driver.quit();
	    }

	    public static void main(String[] args) throws Exception {
	        RightClick obj = new RightClick();
	        obj.launch();
	        obj.rightClick();
	    }

}
