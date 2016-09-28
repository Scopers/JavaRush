package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s_numb1 = reader.readLine();
        String s_numb2 = reader.readLine();
        int numb1 = Integer.parseInt(s_numb1);
        int numb2 = Integer.parseInt(s_numb2);
        System.out.print(name + " получает "+numb1+" через "+numb2+" лет.");

    }
}