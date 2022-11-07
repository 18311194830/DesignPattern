package Proxy.jingtai;

public class Client {
    public static void main(String[] args) {
        IRentHouse iRentHouse = new RentHouse();
        IRentHouse intermediaryProxy = new IntermediaryProxy(iRentHouse);
        intermediaryProxy.rentHouse();
    }
}
