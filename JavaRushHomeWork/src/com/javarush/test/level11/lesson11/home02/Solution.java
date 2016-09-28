package com.javarush.test.level11.lesson11.home02;

/* AppleIPhone и SamsungGalaxyS2
Написать два класса AppleIPhone и SamsungGalaxyS2.
Унаследовать SamsungGalaxyS2 от AppleIPhone.
*/

public class Solution
{
    public static void main(String[] args)
    {
        AppleIPhone phone;
        phone = new AppleIPhone();
        phone.Phoned();
        phone = new SamsungGalaxyS2();
        phone.Phoned();
    }

    public static class AppleIPhone
    {
        public void Phoned(){
            System.out.println("I'm calling from iphome");
        }

    }

    public static class SamsungGalaxyS2 extends AppleIPhone
    {
        public void Phoned(){
            System.out.println("I'm calling from Galaxy");
        }
    }
}
