package com.scripts;

import org.testng.annotations.Test;

import com.common.Amzon_Common;
import com.main.Main;

import org.testng.annotations.BeforeMethod;

public class Amzon_Script extends Main{
  @Test
  public void Amazon_Scrip() {
	  Amzon_Common.SendData();
  }
  

}
