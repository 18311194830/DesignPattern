package ChainofResponsibility;

public abstract class Handler {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected Handler nextLogger;

    /**
     * 赋值方法，设置后继的处理者对象
     * @param nextLogger
     */
    public void setNextLogger(Handler nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            handleRequest(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void handleRequest(String message);
}
