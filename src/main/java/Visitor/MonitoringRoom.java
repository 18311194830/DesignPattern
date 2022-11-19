package Visitor;

public class MonitoringRoom implements Place{
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitorMonitorIngRoom(this);
    }

    public void watching() {
        // 监控室已有的方法
        System.out.println("查看监控录像...*/");
    }
}
