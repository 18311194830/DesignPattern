package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.FoodFactory;
import Factory.AbstractFactory.Meat;

public class MeatFactory implements FoodFactory {
    @Override
    public Meat createA() {
        System.out.println("生产牛肉");
        return new beef();
    }

    @Override
    public Meat createB() {
        System.out.println("生产羊肉");
        return new beef();
    }
}
