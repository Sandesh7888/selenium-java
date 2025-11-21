package com.z.me;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforclass {
	@BeforeMethod
	public void launch() {
		System.out.println("@BeforeMethod application");
	}
	@BeforeClass
	public void befor() {
		System.out.println("@@BeforeClass application");
	}

	@Test
	public void sendData() {
		System.out.println("sendData application");
	}
	@Test
	public void login() {
		System.out.println("login application");
	}
	@BeforeTest
	public void logout() {
		System.out.println("@BeforeTest of application");
	}

	public static void main(String[] args) {
		Beforclass d= new Beforclass();
		d.launch();
		d.sendData();
		d.login();
		d.logout();	
		d.befor();

	}
}
