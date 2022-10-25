package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;

public class biscuit implements Food {
    @Override
    public void eat() {
        System.out.println("吃饼干");
    }
}
