package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("January 32 2013");
    }

    public static boolean isDateOdd(String date)
    {
       Date date1 = new Date(date);
        Date date2 = new Date (date);
        date2.setDate(0);
        date2.setMonth(0);
        long raznich = date1.getTime() - date2.getTime();
        long msDay = 24*60*60*1000;
        double kolDney =raznich/msDay;
        return kolDney % 2 == 0 ?  false :  true;

    }
}
