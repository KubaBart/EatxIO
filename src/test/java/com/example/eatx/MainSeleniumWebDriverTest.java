package com.example.eatx;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.testng.annotations.BeforeTest;


public class MainSeleniumWebDriverTest {

    static WebDriver driver;
    //User
    static String phoneNumber = "997997997";
    static String email = "kuba.bartus@o2.pl";
    static String password = "19021232";
    static String fName = "Kuba";
    static String lName = "Bartus";
    @Before
    public void before(){}
    @Test
    @Order(1)
    public void testRegister()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/register");
        driver.findElement(By.name("number")).sendKeys(phoneNumber);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("firstName")).sendKeys(fName);
        driver.findElement(By.name("lastName")).sendKeys(lName);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div/form/div/div[6]/button")).click();
        driver.close();
    }
    @Test
    @Order(2)
    public void testFunctionalUser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login\"]/div/form/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/a")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[8]/td[4]/form/button")).click();
        driver.close();
    }


}
