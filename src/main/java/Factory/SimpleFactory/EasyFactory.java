package Factory.SimpleFactory;

import Factory.SimpleFactory.Impl.beef;
import Factory.SimpleFactory.Impl.biscuit;
import Factory.SimpleFactory.Impl.candy;
import Factory.SimpleFactory.Impl.mutton;

public class EasyFactory {
    public static Food createFood(String name) {
        Food food = null;
        switch (name) {
            case "牛肉":
                System.out.println("生产牛肉");
                food = new beef();
                break;
            case "羊肉":
                System.out.println("生产羊肉");
                food = new mutton();
                break;
            case "饼干":
                System.out.println("生产饼干");
                food = new biscuit();
                break;
            case "糖果":
                System.out.println("生产糖果");
                food = new candy();
                break;
        }
        return food;
    }
}
