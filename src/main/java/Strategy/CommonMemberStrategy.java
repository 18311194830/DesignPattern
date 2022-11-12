package Strategy;

public class CommonMemberStrategy implements Strategy {
    @Override
    public double calcPrice(double num) {
        return num * 0.9;
    }
}
