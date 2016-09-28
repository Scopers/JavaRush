package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, father is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat catGrandFather = new Cat(grandFather, null, null);

        String grandMother = reader.readLine();
        Cat catGrandMother = new Cat(grandMother, null, null);

        String father = reader.readLine();
        Cat catFather = new Cat(father, catGrandFather, null);

        String mother = reader.readLine();
        Cat catMother = new Cat(mother, null,catGrandMother);

        String douter = reader.readLine();
        Cat catDouter = new Cat(douter, catFather, catMother);

        String son = reader.readLine();
        Cat catSon = new Cat(son, catFather, catMother);





        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDouter);
        System.out.println(catSon);
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;
        private Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father";

            else if (father != null && mother == null)
                return "Cat name is " + name + ", no mother, father is " + father.name;

            else if (father == null && mother != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name +  ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
