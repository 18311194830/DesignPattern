package Factory.SimpleFactory;

public enum FoodTypeEnum {
    FOOD_BEEF(1, "牛肉"),

    FOOD_MUTTON(2, "羊肉"),

    FOOD_BISCUIT(3, "饼干"),

    FOOD_CANDY(4, "糖果");
    private int seq;
    private String food;

    private FoodTypeEnum(int seq, String food) {
        this.seq = seq;
        this.food = food;
    }

    public int getSeq() {
        return seq;
    }

    public String getFood() {
        return food;
    }
}
