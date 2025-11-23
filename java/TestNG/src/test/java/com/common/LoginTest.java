package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.Main;

public class LoginTest extends Main {

    // Locators
    static By username = By.id("username");
    static By password = By.id("password");

    // Method to send data
    public void sendData(String uname, String pass) {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Test Method using DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String uname, String pass) {
        sendData(uname, pass);
    }

    // DataProvider Method
    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][] {
                {"aico@asdkm", "sham"},
                {"newEmail@a.com", "ram"}
        };
    }
}
