package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;
import Factory.OrdinaryFactory.FoodFactory;

public class BeefFactory implements FoodFactory {
    @Override
    public Food create() {
        System.out.println("生产牛肉");
        return new beef();
    }
}
