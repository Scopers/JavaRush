package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        synchronized (allPeople)
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            if (args[0].equals("-c"))
            {
                Person person;

                for (int i = args.length / 3, k = 0; k < i; k++)
                {
                    if (args[2 + k * 3].equals("м"))
                        person = Person.createMale(args[1 + k * 3], dateFormat.parse(args[3 + k * 3]));
                    else
                        person = Person.createFemale(args[1 + k * 3], dateFormat.parse(args[3 + k * 3]));
                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                }


            }
            if (args[0].equals("-u"))
            {
                Person person;
                for (int i = args.length / 4, k = 0; k < i; k++)
                {
                    person = allPeople.get(Integer.parseInt(args[1 + k * 4]));
                    person.setName(args[2 + k * 4]);
                    person.setBirthDay(dateFormat.parse(args[4 + k * 4]));
                    person.setSex(args[3 + k * 4].equals("м") ? Sex.MALE : Sex.FEMALE);
                }

            }
            if (args[0].equals("-d"))
            {
                Person person;
                for (int i = args.length - 1, k = 1; k <= i; k++)
                {
                    allPeople.get(Integer.parseInt(args[k])).setBirthDay(null);
                    allPeople.get(Integer.parseInt(args[k])).setSex(null);
                    allPeople.get(Integer.parseInt(args[k])).setName(null);
                }

            }
            if (args[0].equals("-i"))
            {
                for (int i = args.length - 1, k = 1; k <= i; k++)
                {
                    Integer id = Integer.parseInt(args[k]);
                    SimpleDateFormat data = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                    if (allPeople.get(id).getSex() == Sex.MALE)
                        System.out.println(allPeople.get(id).getName() + " м " + data.format(allPeople.get(id).getBirthDay()));
                    else
                        System.out.println(allPeople.get(id).getName() + " ж " + data.format(allPeople.get(id).getBirthDay()));
                }
            }
        }
    }

}
