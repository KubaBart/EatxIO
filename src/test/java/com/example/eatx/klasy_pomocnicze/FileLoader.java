package com.example.eatx.klasy_pomocnicze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class FileLoader {

    public void dataLoading(String path, ArrayList<String> myArray)
    {
        try {
            File getUserFromFile = new File(path);
            Scanner readFile = new Scanner(getUserFromFile);
            while(readFile.hasNextLine())
            {
                String temp = readFile.nextLine();
                myArray.add(temp);
            }
            readFile.close();
        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
           // System.out.println(myArray.size());
        }
    }
}
