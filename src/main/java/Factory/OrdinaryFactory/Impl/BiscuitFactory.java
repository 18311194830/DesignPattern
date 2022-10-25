package Factory.OrdinaryFactory.Impl;

import Factory.OrdinaryFactory.Food;
import Factory.OrdinaryFactory.FoodFactory;

public class BiscuitFactory implements FoodFactory {
    @Override
    public Food create() {
        System.out.println("生产饼干");
        return new beef();
    }
}
