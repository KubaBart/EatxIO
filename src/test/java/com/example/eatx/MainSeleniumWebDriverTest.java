package com.example.eatx;


import com.example.eatx.setts.PageSetts;
import com.example.eatx.userTests.UserTest;
import com.gargoylesoftware.htmlunit.Page;
import io.cucumber.java.After;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class MainSeleniumWebDriverTest {

    private UserTest registerTest;
    private UserTest loginTest;

    ///Zmienne do Testowania Rejestracji
    private ArrayList<String> informationUserTestRegister = new ArrayList<>();
    private ArrayList<String> userElementsRegister = new ArrayList<>();
    private String domenaRegister = "http://localhost:8080/register";
    private String pathRegister = "src/test/java/com/example/eatx/txt/registerTXT/";
    private String clickNameRegister = "//*[@id='login']/div/form/div/div[6]/button";

    ///Zmienne do Testowania Logowania
    private ArrayList<String> informationUserTestLogin = new ArrayList<>();
    private ArrayList<String> userElementsLogin = new ArrayList<>();
    private String domenaLogin = "http://localhost:8080/login";
    private String pathLogin = "src/test/java/com/example/eatx/txt/loginTXT/";
    private String clickNameLogin = "//*[@id='login']/div/form/button";

    ///

    @BeforeAll
    public static void configuration()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }


    @Test
    public void testRegister()
    {
        registerTest = new UserTest(informationUserTestRegister,userElementsRegister,domenaRegister,pathRegister,clickNameRegister);
        registerTest.dataConf();
        registerTest.testFunctional();
    }

    @Test
    public void testLogin()
    {
        loginTest = new UserTest(informationUserTestLogin,userElementsLogin,domenaLogin,pathLogin,clickNameLogin);
        loginTest.dataConf();
        loginTest.testFunctional();
    }

    @After
    public void closeBrowser() {
        registerTest.getDriver().close();
    }

}








