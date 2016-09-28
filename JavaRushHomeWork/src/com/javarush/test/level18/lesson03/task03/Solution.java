package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
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
        int max = 0;
        for (Integer value : item.values())
            if (max < value){
                max = value;
            }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> pair : item.entrySet())
        {
            if (max == pair.getValue())
                set.add(pair.getKey());
        }
            for (Integer it : set)
        System.out.print(it+" ");
        fileInputStream.close();
    }
}
