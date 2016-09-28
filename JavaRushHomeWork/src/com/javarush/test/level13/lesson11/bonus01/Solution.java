package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader adress = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(adress.readLine()));
        ArrayList<Integer> integersList = new ArrayList<>();


        String c;
        while ((c = reader.readLine()) != null)
        {
            Integer intC = Integer.parseInt(c);
            if (intC % 2 == 0)
            integersList.add(Integer.parseInt(c));
        }
        Object[] array = integersList.toArray();
        Arrays.sort(array);
        for (Object x : array)
            System.out.println(x);
    }
}
