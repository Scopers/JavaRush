package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int count1 = 1;
        int count2 = 1;
        while (count1 < 11)
        {
            while (count2 < 11)
            {
                System.out.print("S");
                count2++;
            }
            System.out.println("");
            count2 = 1;
            count1 ++;
        }

    }
}
