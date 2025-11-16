package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    
    WebDriver driver;
    
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.mahadiscom.in/solar_MTSKPY/scheme_info.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }
    
    public void dropdown() throws InterruptedException {
       
        WebElement dropdown = driver.findElement(By.cssSelector("#navbarDropdown2"));
        dropdown.click();
        Thread.sleep(1000);

        WebElement applyOption = driver.findElement(By.linkText("Apply"));
        applyOption.click();
        
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        CssSelector cs = new CssSelector();
        cs.launch();
        cs.dropdown();
    }
}
