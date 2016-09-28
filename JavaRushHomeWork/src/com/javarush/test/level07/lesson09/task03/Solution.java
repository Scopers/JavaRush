package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("мама");
        lst.add("мыла");
        lst.add("раму");


        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext())
        {
            itr.next();
            itr.add("именно");
            printList(lst);
            System.out.println("");
        }

    }

    public static void printList(List<String> list)
    {
        for (String s : list)
        {
            System.out.println(s);
        }
    }
}
