package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

//public class Solution
//{
//    public static void main(String[] args) throws IOException
//    {
//        HashMap<String,Integer> listMap = new HashMap<String, Integer>();
//        {
//            listMap.put("January",1);
//            listMap.put("February",2);
//            listMap.put("March",3);
//            listMap.put("April",4);
//            listMap.put("May",5);
//            listMap.put("June",6);
//            listMap.put("July",7);
//            listMap.put("August",8);
//            listMap.put("September",9);
//            listMap.put("October",10);
//            listMap.put("November",11);
//            listMap.put("December",12);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String month = reader.readLine();
//            for (Map.Entry<String,Integer> listFor : listMap.entrySet())
//                if (listFor.getKey().equals(month))
//                    System.out.println(listFor.getKey()+" is "+listFor.getValue()+ " month");
//        }
//    }
//
//}
class ThrowsDemo {
    static void procedure() throws IllegalAccessException
    {
        System.out.println(" inside procedure");
        throw new IllegalAccessException("demo");
    }
    public static void main(String aigs[]) {
        try {
            procedure();
        }
        catch (IllegalAccessException e) {
            System.out.println("исключение  " + e);
        }
    }
}