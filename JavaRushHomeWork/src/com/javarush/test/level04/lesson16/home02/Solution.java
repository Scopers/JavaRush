package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        if (a > b && b > c)
            System.out.println(b);
        if (a > c && c > b)
            System.out.println(c);
        if (b > a && a > c)
            System.out.println(a);
        if (b > c && c > a)
            System.out.println(c);
        if (c > a && a > b)
            System.out.println(a);
        if (c > b && b > a)
            System.out.println(b);


    }
}
