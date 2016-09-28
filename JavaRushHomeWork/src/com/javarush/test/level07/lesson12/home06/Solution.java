package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfatherOne = new Human("Анатолий", true, 75, null, null);
        Human grandfatherTwo = new Human("Виктор", true, 65, null, null);
        Human grandmotherOne = new Human("Антонина", false, 70, null, null);
        Human grandmotherTwo = new Human("Людмила", false, 60, null, null);
        Human father = new Human("Владимир", true, 47, grandfatherOne, grandmotherOne);
        Human mother = new Human("Наталья", false, 44, grandfatherTwo, grandmotherTwo);
        Human artem = new Human("Артем", true, 23, father, mother);
        Human igor = new Human("Игор", true, 16, father, mother);
        Human vika = new Human("Вика", false, 4, father, mother);
        System.out.println(grandfatherOne);
        System.out.println(grandfatherTwo);
        System.out.println(grandmotherOne);
        System.out.println(grandmotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(artem);
        System.out.println(igor);
        System.out.println(vika);
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;


        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
