package com.javarush.test.level14.lesson06.home01;

/**
 * Created by 1 on 30.08.2016.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 4;
    }
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.RUSSIA +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
