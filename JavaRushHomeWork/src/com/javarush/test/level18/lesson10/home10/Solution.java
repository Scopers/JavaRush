package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>();
        String name = null;
        while (true)
        {
            String nameFile = reader.readLine();
            if (nameFile.equals("end")) break;
            set.add(nameFile);
            name = nameFile;
        }
        OutputStream fileWrite = new FileOutputStream (name.substring(0,name.lastIndexOf(".")));

        for (String s : set)
        {

            FileInputStream fileRead = new FileInputStream(s);
            byte[] ch = new byte[fileRead.available()];
            fileRead.read(ch);
            fileWrite.write(ch);
            fileRead.close();
        }

        fileWrite.close();
        reader.close();
    }
}

