package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Navigation {
	WebDriver d;
	public void launch() throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://amazon.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		navi();
		
		
		
	}
	public void navi() throws InterruptedException {
		d.navigate().to("https://google.com");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
