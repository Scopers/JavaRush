package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        FileWriter write = new FileWriter(reader.readLine());
        while (true)
        {
            String line = reader.readLine();
            if (line.equals("exit"))
            {
                list.add(line);
                break;
            }
            list.add(line);
        }
        for (String writeLine : list)
        {
            write.write(writeLine);
            write.write("\r\n");
        }
        write.close();
    }
}
