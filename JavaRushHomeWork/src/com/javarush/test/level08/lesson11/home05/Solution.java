package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(s.split("")));
        int count = -1;
        for (int i = 0; i < arrayList.size(); i++)
            if( !arrayList.get(i).equals(" ") && count < 0)
            {
                arrayList.set(i, arrayList.get(i).toUpperCase());
                count=0;
            }
            else if (arrayList.get(i).equals(" ")) {
                    count--;
            }
        for (String print : arrayList)
            System.out.print(print);

        //напишите тут ваш код
    }
    }
