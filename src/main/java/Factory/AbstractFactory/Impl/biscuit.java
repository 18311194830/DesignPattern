package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.Snack;

public class biscuit implements Snack {
    @Override
    public void eat() {
        System.out.println("吃饼干");
    }
}
