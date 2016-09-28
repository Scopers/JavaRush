package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child = new Human("Anton", true, 5, new ArrayList<Human>());
        Human child1 = new Human("Liza", false, 15, new ArrayList<Human>());
        Human child2 = new Human("Misha", true, 25, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child);
        children.add(child1);
        children.add(child2);
        Human mother = new Human("Nataliy", false, 44, children);
        Human father = new Human("Vladimir", true, 46, children);
        ArrayList<Human> parentsMother = new ArrayList<Human>();
        parentsMother.add(mother);
        ArrayList<Human> parentsFather = new ArrayList<Human>();
        parentsFather.add(father);
        Human grandFather1 = new Human("Viktor", true, 46, parentsFather);
        Human grandMother1 = new Human("Ludmila", false, 46, parentsFather);
        Human grandFather2 = new Human("Viktor", true, 46, parentsMother);
        Human grandMother2 = new Human("Ludmila", false, 46, parentsMother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
