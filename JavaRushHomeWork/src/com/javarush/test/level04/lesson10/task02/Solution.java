package com.javarush.test.level04.lesson10.task02;

import java.io.*;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int number = 10;
        while (number >= 1)
        {
            System.out.println(number);
            number --;
        }

    }
}
