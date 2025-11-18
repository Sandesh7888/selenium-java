package sandesh.me;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp_02 {
WebDriver driver;
	
	public void Launch() throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String url=sc.nextLine();
		
		driver= new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(200);
		driver.manage().window().maximize();
		
		
		
	}
	
	public void current() {
		String exp="https://www.gmail.com";
		String act=driver.getCurrentUrl();
		
		if(exp.equalsIgnoreCase(act)) {
			System.out.println("match");
			
		}else {
			System.out.println("not match"+act);
			
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		
 
		Sadbasics_Exp_02 s=new Sadbasics_Exp_02();
		s.Launch();
		s.current();
	}

}
