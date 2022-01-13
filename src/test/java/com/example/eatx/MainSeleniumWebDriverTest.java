package com.example.eatx;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSeleniumWebDriverTest {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");
        driver.findElement(By.name("email")).sendKeys("kuba@o2.pl");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div/form/button")).click();
    }
}
