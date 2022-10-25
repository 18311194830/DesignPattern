package Factory.SimpleFactory.Impl;

import Factory.SimpleFactory.Food;

public class beef implements Food {
    @Override
    public void eat() {
        System.out.println("吃牛肉");
    }
}
