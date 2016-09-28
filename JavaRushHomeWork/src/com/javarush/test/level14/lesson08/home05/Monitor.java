package com.javarush.test.level14.lesson08.home05;

/**
 * Created by 1 on 31.08.2016.
 */
public class Monitor implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
