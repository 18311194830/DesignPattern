package Strategy;

public class Client {
    public static void main(String[] args) {
        double num = 200;

        Price commonCustomer = new Price(new CommonCustomerStrategy());
        double commonCusPrice = commonCustomer.calcPrice(num);
        System.out.println("普通顾客购买价格为：" + commonCusPrice);

        Price commonMember = new Price(new CommonMemberStrategy());
        double commonMemPrice= commonMember.calcPrice(num);
        System.out.println("普通会员购买价格为：" + commonMemPrice);

        Price vipMember = new Price(new VipMemberStrategy());
        double vipMemPrice = vipMember.calcPrice(num);
        System.out.println("vip会员购买价格为：" + vipMemPrice);
    }
}
