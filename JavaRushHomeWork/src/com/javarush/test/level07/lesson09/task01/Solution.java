package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();


        for(int i = 0; i < 20; i++)
            list.add(Integer.parseInt(reader.readLine()));
        for (Integer array : list){
            if (array % 3 == 0)
                list3.add(array);
            if (array % 2 == 0)
                list2.add(array);
            if (array % 3 != 0 && array % 2 != 0)
                list1.add(array);
        }

        printList(list3);
        System.out.println("");
        printList(list2);
        System.out.println("");
        printList(list1);
    }

    public static void printList(List<Integer> list)
    {
        for(Integer x : list)
            System.out.println(x);
    }
}
