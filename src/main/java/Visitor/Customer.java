package Visitor;

public class Customer implements Visitor{
    @Override
    public void visitorWaterCloset(WaterCloset wc) {
        System.out.println("顾客进入卫生间。。。。。");
        wc.washing();
    }

    @Override
    public void visitorStore(Store store) {
        System.out.println("顾客进入商店。。。。。");
        store.shopping();
    }

    @Override
    public void VisitorMonitorIngRoom(MonitoringRoom monitoringRoom) {
        System.out.println("顾客来到监控室。。。。。");
        System.out.println("非工作人员禁止入内。。。。。");
    }
}
