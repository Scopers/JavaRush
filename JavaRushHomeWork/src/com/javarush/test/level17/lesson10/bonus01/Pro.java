package com.javarush.test.level17.lesson10.bonus01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 1 on 17.09.2016.
 */
public class Pro
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("1.txt");
        int sum = 0, data;
        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            sum += data;
            System.out.println(sum);
        }
    }
}
