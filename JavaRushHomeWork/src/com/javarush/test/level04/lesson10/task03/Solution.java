package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String line = reader.readLine();
        String s_number = reader.readLine();
        int number = Integer.parseInt(s_number);
        while (number > 0)
        {
            System.out.println(line);
            number --;
        }

    }
}
