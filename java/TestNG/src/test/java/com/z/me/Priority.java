package com.z.me;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Priority {
  @Test(priority = 1)
  public void f1() {
	  System.out.println("f1");
  }
  
  @Test(priority = 2)
  public void f2() {
	  System.out.println("f2");
  }
  @Test(priority = 0)
  public void f3() {
	  System.out.println("f3");
  }
  @Test(priority = 4)
  public void f4() {
	  System.out.println("f4");
  }
  @Test(priority = 1)
  public void f5() {
	  System.out.println("f5");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
  }
  public static void main(String[] args) {
	  Priority p=new Priority();
	  p.f1();
	  p.f2();
	  p.f3();
	  p.f4();
	  p.f5();
}
  

}
