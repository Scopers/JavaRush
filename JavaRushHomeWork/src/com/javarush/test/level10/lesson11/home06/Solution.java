package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        int age;
        String status;
        boolean sex;
        String name;
        String education;
        String city;

        public Human(int age, String status, boolean sex, String name, String education, String city)
        {
            this.age = age;
            this.status = status;
            this.sex = sex;
            this.name = name;
            this.education = education;
            this.city = city;
        }
        Human (int age, boolean sex, String name){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.status.isEmpty();
            this.city.isEmpty();
            this.education = "Shool";
        }
        Human (int age, boolean sex, String name, Human human){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.status.isEmpty();
            this.city = human.city;
            this.education = human.education;
        }
        Human (int age, boolean sex, String status, String name, Human human){
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.status = status;
            this.city = human.city;
            this.education = human.education;
        }
        Human (Human human){
            this.age = human.age;
            this.sex = human.sex;
            this.name = human.name;
            this.status = human.status;
            this.city = human.city;
            this.education = human.education;
        }
        Human (Human human, Human human1){
            this.age = human.age;
            this.sex = human.sex;
            this.name = human1.name;
            this.status = human1.status;
            this.city = human1.city;
            this.education = human.education;
        }
        Human (Human human, String city){
            this.age = human.age;
            this.sex = human.sex;
            this.name = human.name;
            this.status = human.status;
            this.city = city;
            this.education = human.education;
        }
        Human (Human human, int age){
            this.age = age;
            this.sex = human.sex;
            this.name = human.name;
            this.status = human.status;
            this.city = human.city;
            this.education = human.education;
        }
        Human (Human human, boolean sex){
            this.age = human.age;
            this.sex = sex;
            this.name = human.name;
            this.status = human.status;
            this.city = human.city;
            this.education = human.education;
        }
        Human (Human human, boolean sex, String education){
            this.age = human.age;
            this.sex = sex;
            this.name = human.name;
            this.status = human.status;
            this.city = human.city;
            this.education = education;
        }
    }
}
