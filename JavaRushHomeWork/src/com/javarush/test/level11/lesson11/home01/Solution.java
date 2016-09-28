package com.javarush.test.level11.lesson11.home01;

/* Адам и Ева
Написать два класса Adam(Адам) и Eve(Ева).
Унаследовать Еву от Адама.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Adam man = new Adam();
        Eve woman = new Eve();
        woman.nameMan = "NewAdam";
        System.out.println(woman.nameWoman);
    }

    //Адам
    public static class Adam
    {
        public String nameMan = "Adam";
        public String nameWoman;
    }

    //Ева
    public static class Eve extends Adam
    {

    }
}
