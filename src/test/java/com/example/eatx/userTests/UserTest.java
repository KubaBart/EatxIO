package com.example.eatx.userTests;

import com.example.eatx.klasy_pomocnicze.FileLoader;
import com.example.eatx.setts.PageSetts;
import com.example.eatx.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import java.util.ArrayList;

public class UserTest extends PageSetts {

    private ArrayList<String> informationUserTest;
    private ArrayList<String> userElements;
    private String domena;
    private String path;
    private String clickName;

    public UserTest(ArrayList<String> informationUserTest, ArrayList<String> userElements, String domena, String path, String clickName) {
        super();
        this.informationUserTest = informationUserTest;
        this.userElements = userElements;
        this.path = path;
        this.domena = domena;
        this.clickName = clickName;
    }


    public void dataConf() {
        StringBuilder tempPath = new StringBuilder(path);
        FileLoader myLoader = new FileLoader();
        int length = path.length();
        myLoader.dataLoading(tempPath.append("user").toString(), informationUserTest);
        tempPath.setLength(length);
        myLoader.dataLoading(tempPath.append("elements").toString(), userElements);
        getDriver().get(domena);
    }


    public void testFunctional() {
        int i = 0;
        if ((userElements.size() == informationUserTest.size()) && (userElements.size()!=0) ) {
            try {
                for (String x : userElements) {
                    getDriver().findElement(By.name(userElements.get(i))).sendKeys(informationUserTest.get(i));
                    i++;
                }
                getDriver().findElement(By.xpath(clickName)).click();
            } catch (Exception e)
                {
                    e.printStackTrace();
                        }
        finally{
            System.out.println(i);
        }
    }
        else {
             System.out.println("roznica elementow lub brak elementow");
        }
}

}
