package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] partLine = line.split("\\?");
        line = partLine[1];
        String[] partLine2 = line.split("&");
        ArrayList<String> numbObj = new ArrayList<>();
        for (int i = 0; i < partLine2.length; i++)
        {
            if (partLine2[i].startsWith("obj="))
            {
                String[] partLine3 = partLine2[i].split("=");
                partLine2[i] = partLine3[0];
                numbObj.add(partLine3[1]);
            } else
            {
                String[] partLine3 = partLine2[i].split("=");
                partLine2[i] = partLine3[0];
            }
            System.out.print(partLine2[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < numbObj.size(); i++)
            try{
                alert(Double.parseDouble(numbObj.get(i)));
            }
            catch (Exception e)
            {
                alert(numbObj.get(i));
            }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
