package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String name;
    public String color;
    public String adress;
    public int wieght;
    public int age;
 public Cat (String name)
 {
     this.name = name;
 }
    public Cat (String name, int wieght, int age){
        this.name = name;
        this.wieght = wieght;
        this.age = age;
    }
    public Cat (String name, int age){};
    public Cat (String name, String color){};
    public Cat (int wieght, String color, String adress){};



}
