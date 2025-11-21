package com.z.me;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo02 {
	@BeforeMethod
	public void launch() {
		System.out.println("launch application");
	}

	@Test
	public void sendData() {
		System.out.println("sendData application");
	}
	@Test
	public void login() {
		System.out.println("login application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout of application");
	}

	public static void main(String[] args) {
		Demo02 d= new Demo02();
		d.launch();
		d.sendData();
		d.login();
		d.logout();		

	}
}
