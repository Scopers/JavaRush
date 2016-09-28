package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOne = new FileOutputStream(bufferedReader.readLine());
        InputStream fileTwo = new BufferedInputStream(new FileInputStream(bufferedReader.readLine()));
        InputStream fileThree = new BufferedInputStream(new FileInputStream(bufferedReader.readLine()));

        int sizeBuffOne = fileTwo.available() + fileThree.available();
        int sizeBuffTwo = fileTwo.available();
        int sizeBuffThree = fileThree.available();
        byte[] Buff = new byte[sizeBuffOne];

        fileTwo.read(Buff,0,sizeBuffTwo);
        fileOne.write(Buff,0,sizeBuffTwo);

        fileThree.read(Buff,sizeBuffTwo,sizeBuffThree);
        fileOne.write(Buff,sizeBuffTwo,sizeBuffThree);

        bufferedReader.close();
        fileOne.close();
        fileTwo.close();
        fileThree.close();
    }
}
