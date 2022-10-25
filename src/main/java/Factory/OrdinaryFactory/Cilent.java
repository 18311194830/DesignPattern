package Factory.OrdinaryFactory;

import Factory.OrdinaryFactory.Impl.BeefFactory;

import java.lang.reflect.InvocationTargetException;

public class Cilent {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        FoodFactory beefFactory = (BeefFactory)Class.forName("Factory.OrdinaryFactory.Impl.BeefFactory").getConstructors()[0].newInstance();
        Food food = beefFactory.create();
        food.eat();
    }
}
