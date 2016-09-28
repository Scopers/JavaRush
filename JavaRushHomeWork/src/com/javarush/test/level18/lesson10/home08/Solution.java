package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String nameFile = bufferedReader.readLine();
            if (nameFile.equals("exit")) break;
            new ReadThread(nameFile).start();
        }
        bufferedReader.close();
    }

    public static class ReadThread extends Thread {
        FileInputStream fileRead = new FileInputStream(getName());
        HashMap<Character,Integer> hashMap = new HashMap<>();

        public ReadThread(String fileName) throws FileNotFoundException
        {
            super(fileName);

        }

        @Override
        public void run()
        {
            try
            {
                while (fileRead.available() > 0)
                {
                    char item = (char)fileRead.read();
                    if (!hashMap.containsKey(item))
                        hashMap.put(item, 1);
                    else
                        hashMap.put(item,hashMap.get(item)+1);
                }
                fileRead.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            Integer max = Integer.MIN_VALUE;
            for (Integer s : hashMap.values())
                if (max < s)
                    max = s;
            for (Map.Entry<Character,Integer> maxItem : hashMap.entrySet())
                if (maxItem.getValue() == max)
                {
                    resultMap.put(getName(), Integer.valueOf(maxItem.getKey()));
                }

        }

    }
}
