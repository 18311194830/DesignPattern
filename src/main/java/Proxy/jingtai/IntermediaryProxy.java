package Proxy.jingtai;

public class IntermediaryProxy implements IRentHouse{
    private IRentHouse iRentHouse;

    public IntermediaryProxy(IRentHouse iRentHouse) {
        this.iRentHouse = iRentHouse;
    }

    @Override
    public void rentHouse() {
        System.out.println("中介向外出租房子");
        iRentHouse.rentHouse();
        System.out.println("中介负责维修管理");
    }
}
