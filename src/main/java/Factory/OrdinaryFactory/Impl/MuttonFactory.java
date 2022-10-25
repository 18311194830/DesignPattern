package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;
import Factory.OrdinaryFactory.FoodFactory;

public class MuttonFactory implements FoodFactory {
    @Override
    public Food create() {
        System.out.println("生产羊肉");
        return new beef();
    }
}
