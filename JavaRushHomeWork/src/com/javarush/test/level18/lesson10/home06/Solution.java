package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        FileInputStream fileRead = new FileInputStream(args[0]);
        while (fileRead.available() > 0)
        {
            char item = (char)fileRead.read();
            if (!hashMap.containsKey(item))
                hashMap.put(item, 1);
            else
                hashMap.put(item,hashMap.get(item)+1);
        }

        Set<Character> set = new TreeSet<>(hashMap.keySet());
        for (Character s : set)
            System.out.println(s+" "+hashMap.get(s));
        fileRead.close();
    }
}
