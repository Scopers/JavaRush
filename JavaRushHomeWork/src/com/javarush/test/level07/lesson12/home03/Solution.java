package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());

        for (int i = array.length - 1; 0 <= i; i--)
            for (int j = 0; j < i; j++)
              if (array[j] > array[j + 1])
                {
                    int t = array[j];
                    array[j] = array [j+1];
                    array[j+1]=t;
                }


        int maximum = array[array.length-1];
        int minimum = array[0];

        //напишите тут ваш код


        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
