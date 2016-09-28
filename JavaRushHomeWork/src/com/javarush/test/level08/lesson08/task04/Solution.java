package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        Calendar calendar = Calendar.getInstance();

        calendar.set(1980,Calendar.JULY,1);
        map.put("Stallone", calendar.getTime());

        calendar.set(1975,Calendar.JUNE,2);
        map.put("Stallone2", calendar.getTime());

        calendar.set(1960,Calendar.AUGUST,25);
        map.put("Stallone3", calendar.getTime());

        calendar.set(1956,Calendar.APRIL,10);
        map.put("Stallone4", calendar.getTime());

        calendar.set(1986,Calendar.JANUARY,20);
        map.put("Stallone5", calendar.getTime());

        calendar.set(1945,Calendar.SEPTEMBER,1);
        map.put("Stallone6", calendar.getTime());

        calendar.set(1935,Calendar.OCTOBER,5);
        map.put("Stallone7", calendar.getTime());

        calendar.set(1988,Calendar.DECEMBER,12);
        map.put("Stallone8", calendar.getTime());

        calendar.set(1990,Calendar.FEBRUARY,12);
        map.put("Stallone9", calendar.getTime());

        calendar.set(1995,Calendar.APRIL,10);
        map.put("Stallone10", calendar.getTime());

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> item = iterator.next();
            if ((item.getValue().getMonth() > 4) && (item.getValue().getMonth() < 8))
                iterator.remove();
        }
    }
}
