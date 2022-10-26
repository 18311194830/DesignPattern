package Factory.AbstractFactory;

import Factory.AbstractFactory.Impl.SnackFactory;

import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, ClassNotFoundException {
        FoodFactory snackFactory = (SnackFactory) Class.forName("Factory.AbstractFactory.Impl.SnackFactory").getConstructors()[0].newInstance();
        Food snackA = snackFactory.createA();
        snackA.eat();
    }
}
