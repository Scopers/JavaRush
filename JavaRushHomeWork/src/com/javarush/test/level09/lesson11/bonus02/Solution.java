//package com.javarush.test.level09.lesson11.bonus02;/* This is just the sample code to print A+B */
//
//import java.util.*;
//
//public class Solution {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int numEmail = scanner.nextInt();
//        String numEmail1 = scanner.nextLine();
//        String[] emailList = new String[numEmail];
//
//        for (int i = 0; i < numEmail; i++)
//            emailList[i] = scanner.nextLine();
//
//        ArrayList<String> gmail = new ArrayList<String>();
//        ArrayList<String> eOther = new ArrayList<String>();
//
//        for (int i = 0; i < emailList.length; i++)
//            if (emailList[i].toLowerCase().contains("@gmail.com"))
//                gmail.add(emailList[i]);
//            else
//                eOther.add(emailList[i]);
//
//
//
//        ArrayList<String> eOtherResult = new ArrayList<String>();
//        int cout1 = 0;
//        for (int i = 0; i < eOther.size(); i ++)
//        {   String s = eOther.get(i);
//            int count = 1;
//            for (int j = 0; j < eOther.size(); j++)
//                if (eOther.get(i).toLowerCase().equals(eOther.get(j).toLowerCase()) && i != j){
//                    s = s+ " " + eOther.get(j);
//                    eOther.remove(j);
//                    count++;
//                }
//            eOtherResult.add(count + " " + s);
//            cout1++;
//        }
//        System.out.println(deletePoint("ar.rrr"));
//
//        // Вывод
//        System.out.println(cout1);
//        for (String ss: eOtherResult)
//            System.out.println(ss);
//    }
//
//    public static void deletePoint(ArrayList<String> gmail)
//    {
//        for (int i = 0; i < gmail.size(); i++)
//        {
//            gmail.set(i,gmail.get(i).replace(".",""));
//        }
//    }
//}
