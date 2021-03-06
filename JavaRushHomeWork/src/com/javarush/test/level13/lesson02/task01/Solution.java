package com.javarush.test.level13.lesson02.task01;

/* Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуйте все нереализованные методы.
3. Подумай, как связаны переменная  READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Beer beer = new Beer();
        beer.askMore("Дай Пивка");
        beer.sayThankYou();
        if (!beer.isReadyToGoHome())
        {
            beer.askMore("Дай Пивка");
            beer.sayThankYou();
        }
        beer.sleepOnTheFloor();
    }

    public interface Drink
    {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink
    {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol
    {

        @Override
        public void askMore(String message)
        {
            System.out.println(message);
        }

        @Override
        public void sayThankYou()
        {
            System.out.println("Thank You");
        }

        @Override
        public boolean isReadyToGoHome()
        {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor()
        {
            System.out.println("I Sleep");
        }
    }
}
