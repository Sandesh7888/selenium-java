package com.sandesh.me;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp_3 {

	WebDriver driver;
	
	public void Launch() throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter URL");
		String url=sc.nextLine();
		
		for(int i=0;i<2;i++) {
			driver=new ChromeDriver();
			driver.get(url);
//			System.out.println(driver.getTitle()+driver.getPageSource());
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		Sadbasics_Exp_3 s=new Sadbasics_Exp_3();
		s.Launch();
		

	}
}
