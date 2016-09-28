package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id,
 найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();
        if (args[0].equals("-c"))
        {
            FileWriter fileWriter = new FileWriter(nameFile, true);
            fileWriter.write(fomatedLine(nameFile,args)+"\n");
            fileWriter.close();
        }

    }

    public static String fomatedLine(String file, String[] args) throws IOException
    {
        Integer id = getId(file);
        String idString = formated(String.valueOf(id), 8);
        for (int i = 1; i < args.length - 2; i++)
        {
            args[1] += " " + args[1 + i];
        }
        String productName = formated(args[1], 30);
        String price = formated(args[args.length - 2], 8);
        String quantity = formated(args[args.length - 1], 4);
        return idString + productName + price + quantity;
    }

    public static Integer getId(String fileName) throws IOException
    {
        BufferedReader fileNam = new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> list = new ArrayList<>();
        while (fileNam.ready())
        {
            String id = fileNam.readLine().substring(0, 8).trim();
            list.add(Integer.valueOf(id));
        }
        fileNam.close();
        return Collections.max(list) + 1;
    }


    public static String formated(String line, int sizeLine)
    {
        while (line.length() < sizeLine)
        {
            line += " ";
        }
        if (line.length() > sizeLine)
        {
            line = line.substring(0, sizeLine);
        }
        return line;
    }
}

