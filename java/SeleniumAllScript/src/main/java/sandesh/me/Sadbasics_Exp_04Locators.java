package sandesh.me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp_04Locators {
	
	WebDriver driver;
	public void Launch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	public void sendData() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsun mobile");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		

		Sadbasics_Exp_04Locators s=new Sadbasics_Exp_04Locators();
		s.Launch();
		s.sendData();
	}

}
