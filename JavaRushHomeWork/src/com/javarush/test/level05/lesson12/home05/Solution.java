package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        while (true){
            String sNumb = reader.readLine();
            if (sNumb.equals("сумма"))
                break;
            int numb = Integer.parseInt(sNumb);
            summa += numb;
        }
        System.out.println(summa);
    }
}
