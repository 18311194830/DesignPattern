package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;
import Factory.OrdinaryFactory.FoodFactory;

public class CandyFactory implements FoodFactory {
    @Override
    public Food create() {
        System.out.println("生产糖果");
        return new beef();
    }
}
