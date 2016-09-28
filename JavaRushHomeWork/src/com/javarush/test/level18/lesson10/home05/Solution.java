package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileRead = new FileInputStream(bufferedReader.readLine());
        OutputStream fileWrite = new FileOutputStream(bufferedReader.readLine());
        StringBuffer buffer = new StringBuffer();
        while (fileRead.available() > 0)
        {
            buffer.append((char) fileRead.read());
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(buffer.toString().split(" ")));
        for (int i = 0; i < arrayList.size(); i++)
        {
            Double d = Double.parseDouble(arrayList.get(i));
            arrayList.set(i, String.valueOf( Math.round(d)));
            fileWrite.write(arrayList.get(i).getBytes());
            fileWrite.write(" ".getBytes());
        }
        bufferedReader.close();
        fileRead.close();
        fileWrite.close();
    }
}
