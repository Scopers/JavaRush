package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

//    public static void sort(String[] array)
//    {
//        ArrayList<String> word = new ArrayList<String>();
//        ArrayList<String> numb = new ArrayList<String>();
//        for (String item : array)
//        {
//            if (isNumber(item))
//                numb.add(item);
//            else word.add(item);
//        }
//
//        for (int i = numb.size()-1; i>0; i-- )
//            for (int j = 0; i > j; j++)
//                if (!isGreaterThan(numb.get(j),numb.get(j+1)))
//                {
//                    String t = numb.get(j);
//                    numb.set(j,numb.get(j+1));
//                    numb.set(j+1,t);
//                }
//
//        for (int i = word.size()-1; i > 0 ; i-- )
//            for (int j = 0; i > j; j++)
//                if (isGreaterThan(word.get(j),word.get(j+1)))
//                {
//                    String t = word.get(j);
//                    word.set(j,word.get(j+1));
//                    word.set(j+1,t);
//                }
//
//                int contNamb = 0;
//                int contWord = 0;
//         for (int i = 0; array.length >i ; i++)
//             if (isNumber(array[i])){
//             array[i] = numb.get(contNamb);
//                 contNamb++;
//             }
//             else
//             {
//                 array[i] = word.get(contWord);
//                 contWord++;
//             }
//    }
public static void sort(String[] array)
{
    for (int i = 0; i < array.length; i++){
        for (int j = i + 1; j < array.length; j++){
            if (isNumber(array[i])){
                if (isNumber(array[j])){
                    int a = Integer.parseInt(array[i]);
                    int b = Integer.parseInt(array[j]);
                    if (b > a){
                        String tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
            else
            {
                if (!isNumber(array[j])){
                    if (isGreaterThan(array[i], array[j])){
                        String tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
        }
    }
}

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
