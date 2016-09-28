package com.javarush.test.level14.lesson08.bonus03;

class Cat
{
    public Cat parent;
    public Cat getMyParent()
    {
        return this.parent;
    }
    public void setMyParent(Cat cat)
    {
        this.parent = cat;
    }
}
class Tiger extends Cat
{
    public Tiger getMyParent()
    {
        return (Tiger) this.parent;
    }

    public static void main(String[] args)
    {
        Cat parent = new Cat();

        Cat me = new Cat();
        me.setMyParent(parent);
        Cat myParent = me.getMyParent();
    }
}