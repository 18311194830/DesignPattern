package State;

import sun.rmi.runtime.Log;

import java.util.Objects;

/**
 * 此类持有一个State引用，负责在流程中保持并切换状态
 */
public class JdLogistics {
    private LogisticsState logisticsState;

    public LogisticsState getLogisticsState() {
        return logisticsState;
    }

    public void setLogisticsState(LogisticsState logisticsState) {
        this.logisticsState = logisticsState;
    }

    public void doAction(){
        Objects.requireNonNull(logisticsState);
        logisticsState.doAction(this);
    }
}
