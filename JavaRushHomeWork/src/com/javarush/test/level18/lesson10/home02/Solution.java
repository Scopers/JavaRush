package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream file = new FileInputStream(args[0]);
        int count = 0;
        int countSpace = 0;
        while (file.available() > 0)
        {
            if (file.read() == ' ')
            {
                countSpace++;

            }
            count++;
        }
        Double result =(double) countSpace/count*100;
        System.out.println(count);
        System.out.printf("%.2f", result);


        file.close();
    }
}
