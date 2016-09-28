package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("father");
        list.add("brother");
        list.add("I");
        list.add("cat");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
