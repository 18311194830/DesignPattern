package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;

public class mutton implements Food {
    @Override
    public void eat() {
        System.out.println("吃羊肉");
    }
}
