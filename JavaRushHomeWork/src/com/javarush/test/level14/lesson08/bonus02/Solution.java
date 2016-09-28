package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> numb = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numb.add(Integer.parseInt(reader.readLine()));
        numb.add(Integer.parseInt(reader.readLine()));
        max(numb);
        int ost = numb.get(1);
        while (true)
        {
            int a = numb.get(0);
            int b = numb.get(1);

            if ((a % b) != 0)
            {
                ost = a % b;
                numb.set(0,ost);
                max(numb);
            }
            else
            {
                System.out.println(ost);
                break;
            }
        }
    }
    public static ArrayList<Integer> max(ArrayList<Integer> list){
        if (list.get(0) > list.get(1))
            return list;
        else {
            int t = list.get(0);
            list.set(0, list.get(1));
            list.set(1, t);
            return list;
        }
    }
}
