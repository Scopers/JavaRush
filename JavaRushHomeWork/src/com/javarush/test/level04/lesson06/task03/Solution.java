package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
    if (a > b && b > c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    else if (a>c && b < c)
        {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
    else if (a < b && a > c)
        {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
    else if (c < b && c > a)
        {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
    else if (c > a && a > b)
        {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    else if (c>b && b>a)
        {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
