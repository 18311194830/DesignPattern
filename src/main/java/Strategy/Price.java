package Strategy;

public class Price {
    private Strategy strategy;

    public Price(Strategy strategy){
        this.strategy = strategy;
    }

    public double calcPrice(double num){
        return this.strategy.calcPrice(num);
    }
}
