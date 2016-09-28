package com.javarush.test.level13.lesson11.bonus02;

class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
    void pull (Person person){
        System.out.println(this.name + " за "+ person.namePadezh);
    }

    @Override
    public String getNamePadezh()
    {
        return null;
    }
}
