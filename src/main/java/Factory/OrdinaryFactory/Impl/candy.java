package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;

public class candy implements Food {
    @Override
    public void eat() {
        System.out.println("吃糖果");
    }
}
