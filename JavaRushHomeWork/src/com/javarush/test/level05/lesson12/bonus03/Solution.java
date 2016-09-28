package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        while (true){
            n = Integer.parseInt(reader.readLine());
            if (n > 0)
                break;
        }
        for (int i = 0; n > i; i++)
        {
            int numb = Integer.parseInt(reader.readLine());
            if ( numb > max || (max == 0 && numb < 0))
                max = numb;
        }

        int maximum = max;
        System.out.println(maximum);
    }
}
