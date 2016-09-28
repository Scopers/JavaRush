package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        int sum = 0;
         while (a != -1)
         {
             sum += a;
             String sNewA = reader.readLine();
             int newA = Integer.parseInt(sNewA);
             a = newA;

         }
        sum += a;
        System.out.println(sum);
    }
}
