package com.javarush.test.level14.lesson08.bonus01;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

       try
       {
          throw new ClassCastException();
       }
       catch (ClassCastException e)
       {
           exceptions.add(e);
       }
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new NoSuchElementException();
        }
        catch (NoSuchElementException e){
            exceptions.add(e);
        }
        try
        {
            throw new NoSuchFieldException();
        }
        catch (NoSuchFieldException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new SQLException();
        }
        catch (SQLException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new SQLDataException();
        }
        catch (SQLDataException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new NoSuchMethodException();
        }
        catch (NoSuchMethodException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new EOFException();
        }
        catch (EOFException e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException e)
        {
            exceptions.add(e);
        }
        Object szStr[] = new Object[10];

        try
        {
            szStr[0] = 5;
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println(szStr[0]);
    }
}
