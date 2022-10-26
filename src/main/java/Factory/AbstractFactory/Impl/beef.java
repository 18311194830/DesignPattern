package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.Meat;

public class beef implements Meat {
    @Override
    public void eat() {
        System.out.println("吃牛肉");
    }
}
