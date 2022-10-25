package Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Food beef = EasyFactory.createFood(FoodTypeEnum.FOOD_BEEF.getFood());
        beef.eat();
    }
}
