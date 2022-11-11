package State;
/**
 * 运输状态类
 */
public class TransportState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商品正在运往天津分发中心");
    }
}
