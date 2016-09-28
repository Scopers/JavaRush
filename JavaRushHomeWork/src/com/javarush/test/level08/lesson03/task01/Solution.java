package com.javarush.test.level08.lesson03.task01;
import java.util.HashSet;
import java.util.Set;
/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> set = new HashSet<String>();
        set.add("ирис");     set.add("ежевика");
        set.add("арбуз");
        set.add("жень-шень");
        set.add("вишня");
        set.add("груша");
        set.add("банан");


        set.add("земляника");

        set.add("картофель");
        set.add("дыня");
        for (String setFor : set)
            System.out.println(setFor);
    }
}