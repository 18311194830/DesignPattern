package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.Snack;

public class candy implements Snack {
    @Override
    public void eat() {
        System.out.println("吃糖果");
    }
}
