package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();
        Map<Integer,Integer> item = new HashMap<>();
        while (fileInputStream.available() > 0)
        {
            int element = fileInputStream.read();
            if (!item.containsKey(element))
                item.put(element, 1);
            else
                item.put(element, item.get(element) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (Integer value : item.values())
            if (min > value){
                min = value;
            }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> pair : item.entrySet())
        {
            if (min == pair.getValue())
                set.add(pair.getKey());
        }
        for (int it : set)
            System.out.print((char) it+" ");
        fileInputStream.close();
    }
}