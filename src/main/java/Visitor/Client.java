package Visitor;

public class Client {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        superMarket.addPlace(new WaterCloset());
        superMarket.addPlace(new Store());
        superMarket.addPlace(new MonitoringRoom());

        Visitor customer = new Customer();
        superMarket.handleRequest(customer);

        Visitor marketStaff = new MarketStaff();
        superMarket.handleRequest(marketStaff);
    }
}
