package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.Meat;

public class mutton implements Meat {
    @Override
    public void eat() {
        System.out.println("吃羊肉");
    }
}
