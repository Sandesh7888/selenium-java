package com.script;

import org.testng.annotations.Test;

public class Demo01 {
	@Test
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
	@Test
	public void getTitle() {
		System.out.println("getTitle of application");
	}

	public static void main(String[] args) {
		Demo01 d= new Demo01();
		d.launch();
		d.sendData();
		d.login();
		d.getTitle();		

	}

}
