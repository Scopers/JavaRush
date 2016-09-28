package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException
    {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args[0].equals("-c"))
        {
            String names = null;
            int countWord = args.length - 4;
            names = args[1];
            if (args.length > 4)
            {
                for (int i = 2; i <= 1 + countWord; i++)
                    names +=" "+ args[i];
                args[1] = names;
            }

            {
                if (args[2+countWord].equals("м"))
                    allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3+countWord])));
                else
                    allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3+countWord])));
            }
        }
        if (args[0].equals("-u"))
        {
            String names = null;
            int countWord = args.length - 5;
            names = args[2];
            if (args.length > 5)
            {
                for (int i = 3; i <= 2 + countWord; i++)
                    names +=" "+ args[i];
                args[2] = names;
            }

            Person person;
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setBirthDay(dateFormat.parse(args[4+countWord]));
            person.setSex(args[3+countWord].equals("м") ? Sex.MALE : Sex.FEMALE);

        }
        if (args[0].equals("-d"))
        {
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setName(null);
        }
        if (args[0].equals("-i"))
        {
            Integer id = Integer.parseInt(args[1]);
            SimpleDateFormat data = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
            if (allPeople.get(id).getSex() == Sex.MALE)
                System.out.println(allPeople.get(id).getName() + " м " + data.format(allPeople.get(id).getBirthDay()));
            else
                System.out.println(allPeople.get(id).getName() + " ж " + data.format(allPeople.get(id).getBirthDay()));

        }



    }public static class Print
    {
        public static void print(int k)
        {
            Integer id = k;
            SimpleDateFormat data = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
            if (allPeople.get(id).getSex() == Sex.MALE)
                System.out.println(allPeople.get(id).getName() + " м " + data.format(allPeople.get(id).getBirthDay()));
            else
                System.out.println(allPeople.get(id).getName() + " ж " + data.format(allPeople.get(id).getBirthDay()));
        }
    }
}

