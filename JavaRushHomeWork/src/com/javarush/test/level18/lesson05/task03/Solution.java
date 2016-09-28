package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream1 = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileInputStream2 = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream fileInputStream3 = new FileOutputStream(bufferedReader.readLine());
        int countByte1 = fileInputStream1.available();
        int countByte2;
        int countByte3;
        byte[] data = new byte[countByte1];
        if (countByte1 % 2 == 0)
        {
            countByte2 = countByte3 = countByte1 / 2;
        }
        else
        {
            countByte2 = countByte1 / 2 + 1;
            countByte3 = countByte1 / 2 ;
        }

        fileInputStream1.read(data,0,countByte2);
        fileInputStream2.write(data,0,countByte2);

        fileInputStream1.read(data,countByte2,countByte3);
        fileInputStream3.write(data,countByte2,countByte3);

        bufferedReader.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
