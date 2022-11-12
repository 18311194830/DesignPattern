package Strategy;

public class VipMemberStrategy implements Strategy {
    @Override
    public double calcPrice(double num) {
        return num * 0.8;
    }
}
