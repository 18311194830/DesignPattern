package Visitor;

public class WaterCloset implements Place{
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitorWaterCloset(this);
    }

    /**
     * 该具体元素已有方法
     */
    public void washing(){
        System.out.println("洗洗手。。。。。");
    }
}
