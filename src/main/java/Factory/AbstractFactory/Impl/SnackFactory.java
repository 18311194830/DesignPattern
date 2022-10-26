package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.Food;
import Factory.AbstractFactory.FoodFactory;
import Factory.AbstractFactory.Snack;

public class SnackFactory implements FoodFactory {
    @Override
    public Snack createA() {
        System.out.println("生产糖果");
        return new candy();
    }

    @Override
    public Snack createB() {
        System.out.println("生产饼干");
        return new biscuit();
    }
}
