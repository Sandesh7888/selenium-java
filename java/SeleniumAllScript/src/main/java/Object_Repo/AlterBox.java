package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterBox {

	public void ClikeOK() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("asdf");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		String data =driver.switchTo().alert().getText();
		System.out.println(data);
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		

	}

}
