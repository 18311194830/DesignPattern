package Visitor;

public class MarketStaff implements Visitor{
    @Override
    public void visitorWaterCloset(WaterCloset wc) {
        System.out.println("工作人员进入卫生间。。。。。");
        wc.washing();
    }

    @Override
    public void visitorStore(Store store) {
        System.out.println("工作人员进行商店巡视。。。。。");
    }

    @Override
    public void VisitorMonitorIngRoom(MonitoringRoom monitoringRoom) {
        System.out.println("工作人员进入监控室。。。。。");
        monitoringRoom.watching();
    }
}
