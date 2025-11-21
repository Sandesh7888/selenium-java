package com.z.me;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Enable {
  @Test(priority = 1)
  public void f1() {
	  System.out.println("f1");
  }
  
  @Test(priority = 2,enabled = false)
  public void f2() {
	  System.out.println("f2");
  }
  @Test(priority = 0, enabled = false)
  public void f3() {
	  System.out.println("f3");
  }
  @Test(priority = 4, description = "detailed info")
  public void f4() {
	  System.out.println("f4");
  }
  @Test(priority = 1)
  public void f5() {
	  System.out.println("f5");
  }
  @BeforeMethod(enabled = false)
  public void beforeMethod() {
	  System.out.println("BM");
  }
  public static void main(String[] args) {
	  Enable p=new Enable();
	  p.f1();
	  p.f2();
	  p.f3();
	  p.f4();
	  p.f5();
}
  

}
