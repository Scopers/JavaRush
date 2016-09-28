package com.javarush.test.level15.lesson12.home05;

/**
 * Created by 1 on 04.09.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(int i)
    {
        super(i);
    }

    public SubSolution(int i, int k)
    {
        super(i, k);
    }

    public SubSolution(int i, int k, int j)
    {
        super(i, k, j);
    }

    protected SubSolution(double i)
    {
        super(i);
    }

    protected SubSolution(Double i)
    {
        super(i);
    }

    protected SubSolution(Integer i)
    {
        super(i);
    }

    SubSolution(Object k)
    {
        super();
    }

    SubSolution(Object k, int l)
    {
        super(k, l);
    }

    SubSolution(Object k, short o)
    {
        super(k, o);

    }
    private SubSolution(String i){
        super();
    };
    private SubSolution(String i, int j){
        super();
    };
    private SubSolution(Integer i, short l){
        super(i, l);
    };

}
