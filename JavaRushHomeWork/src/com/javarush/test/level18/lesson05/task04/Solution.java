package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream1 = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileInputStream2 = new FileOutputStream(bufferedReader.readLine());
        ArrayList <Integer> arrayList = new ArrayList<>();
        while (fileInputStream1.available() > 0){
            arrayList.add(fileInputStream1.read());
        }
       for (int i = arrayList.size()-1; i >= 0; i--)
            fileInputStream2.write(arrayList.get(i));
        bufferedReader.close();
        fileInputStream1.close();
        fileInputStream2.close();

    }
}
