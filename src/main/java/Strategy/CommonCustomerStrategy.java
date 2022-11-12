package Strategy;

public class CommonCustomerStrategy implements Strategy{
    @Override
    public double calcPrice(double num) {
        return num;
    }
}
