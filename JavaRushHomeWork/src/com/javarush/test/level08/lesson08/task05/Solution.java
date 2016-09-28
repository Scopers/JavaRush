package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,String> hashMap = createMap();
        removeTheFirstNameDuplicates(hashMap);
        System.out.println(hashMap);
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Воробьев", "Артемий");
        hashMap.put("Дуров", "Артем");
        hashMap.put("Семенов", "Семен");
        hashMap.put("Семикашев", "Артем");
        hashMap.put("Наполеон", "Первый");
        hashMap.put("Петр", "Первый");
        hashMap.put("Никиктина", "Мария");
        hashMap.put("Крисина", "Мария");
        hashMap.put("Редуцкий", "Александр");
        hashMap.put("Усов", "Вадим");
        return hashMap;
    }

   public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map1 = new HashMap<String, String>(map);
        HashSet<String> mapNameDuplicates = new HashSet<String>();

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> item = iterator.next();
            Iterator<Map.Entry<String,String>> iterator1 = map1.entrySet().iterator();


            while (iterator1.hasNext())
            {
                Map.Entry<String, String> item1 = iterator1.next();

                if (item1.getValue().equals(item.getValue()) && !item1.getKey().equals(item.getKey()))
                {
                    mapNameDuplicates.add(item.getValue());
                }
            }
        }
        for(String mapNameDuplicatesFor : mapNameDuplicates)
            removeItemFromMapByValue(map,mapNameDuplicatesFor);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
