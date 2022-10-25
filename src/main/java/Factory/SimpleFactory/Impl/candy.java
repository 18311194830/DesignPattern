package Factory.SimpleFactory.Impl;

import Factory.SimpleFactory.Food;

public class candy implements Food {
    @Override
    public void eat() {
        System.out.println("吃糖果");
    }
}
