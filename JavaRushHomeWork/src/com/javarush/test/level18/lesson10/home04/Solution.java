package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = bufferedReader.readLine();
        String fileNameTwo = bufferedReader.readLine();
        bufferedReader.close();

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileNameOne,"rw");
//        FileInputStream fileOne = new FileInputStream(fileNameOne);
        byte[] buffOne = new byte[(int)randomAccessFile.length()];
        randomAccessFile.read(buffOne);
        randomAccessFile.seek(0);

        FileInputStream fileTwo = new FileInputStream(fileNameTwo);
        byte[] buffTwo = new byte[fileTwo.available()];
        fileTwo.read(buffTwo);

        randomAccessFile.write(buffTwo);
randomAccessFile.write(buffOne);
//        fileOneWrite.write(buffOne);
//        fileOneWrite.close();
        fileTwo.close();
    }
}
