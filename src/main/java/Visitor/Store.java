package Visitor;

public class Store implements Place{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitorStore(this);
    }

    public void shopping() {
        // 商店已有的方法
        System.out.println("欢迎光临，祝您购物愉快。。。*/");
    }
}
