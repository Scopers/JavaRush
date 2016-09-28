package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for(Integer i = 0; i < 10; i++)
        map.put(i.toString(), "Artem");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
{
    int count = 0;
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext())

        if (name.equals(iterator.next().getValue()))
            count++;

    return count;

}

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            if (lastName.equals(iterator.next().getKey()))
                count++;
        return count;
    }
}
