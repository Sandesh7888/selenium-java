package javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataUsingJS {

    WebDriver driver;
    JavascriptExecutor js;

    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

       
    }

    public void sendData() throws InterruptedException {
    	js = (JavascriptExecutor) driver;
    	WebElement we=driver.findElement(By.id("username")); 
        js.executeScript("arguments[0].value='sandesh';",we);

        Thread.sleep(2000);
        WebElement pass=driver.findElement(By.id("password")); 
        js.executeScript("arguments[0].value='pass123';",pass);
    }
    public void click() {
    	js = (JavascriptExecutor) driver;
    	WebElement login=driver.findElement(By.id("username")); 
        js.executeScript("arguments[0].click;",login);
    	
    }
    public void Hilight() {
    	
    	js =(JavascriptExecutor) driver;
    	WebElement we=driver.findElement(By.id("username")); 
        js.executeScript("arguments[0].value='sandesh';",we);
    	js.executeScript("arguments[0].style='border:5px solid red';",we);
    }

    public static void main(String[] args) throws Exception {
        SendDataUsingJS obj = new SendDataUsingJS();
        obj.launch();
        obj.sendData();
        obj.click();
        obj.driver.quit();
        
    }
}
