package State;

public class Client {
    public static void main(String[] args) {
        JdLogistics jdLogistics = new JdLogistics();

        OrderState orderState = new OrderState();
        jdLogistics.setLogisticsState(orderState);
        jdLogistics.doAction();

        ProductOutState productOutState = new ProductOutState();
        jdLogistics.setLogisticsState(productOutState);
        jdLogistics.doAction();

        TransportState transportState = new TransportState();
        jdLogistics.setLogisticsState(transportState);
        jdLogistics.doAction();
    }
}
