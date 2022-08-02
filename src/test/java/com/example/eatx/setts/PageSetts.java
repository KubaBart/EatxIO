package com.example.eatx.setts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageSetts {

    private WebDriver driver;


    public PageSetts()
    {
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            return driver;
        }else{
            return driver;
        }
    }

}
