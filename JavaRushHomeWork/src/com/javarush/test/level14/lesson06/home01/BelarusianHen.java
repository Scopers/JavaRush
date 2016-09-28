package com.javarush.test.level14.lesson06.home01;

/**
 * Created by 1 on 30.08.2016.
 */
public class BelarusianHen  extends Hen
{
    @Override
     int getCountOfEggsPerMonth()
    {
        return 1;
    }

    @Override
     String getDescription()
    {

        return super.getDescription()+" Моя страна - "+ Country.BELARUS+". Я несу 1 яиц в месяц.";
    }
}
