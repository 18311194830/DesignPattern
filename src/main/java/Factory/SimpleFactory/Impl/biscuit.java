package Factory.SimpleFactory.Impl;

import Factory.SimpleFactory.Food;

public class biscuit implements Food {
    @Override
    public void eat() {
        System.out.println("吃饼干");
    }
}
