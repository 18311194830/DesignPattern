package Factory.OrdinaryFactory.Impl;


import Factory.OrdinaryFactory.Food;

public class beef implements Food {
    @Override
    public void eat() {
        System.out.println("吃牛肉");
    }
}
