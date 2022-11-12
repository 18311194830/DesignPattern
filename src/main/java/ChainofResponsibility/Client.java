package ChainofResponsibility;

public class Client {
    public static void main(String[] args) {
        //组装职责链
        Handler errorLogger = new ErrorLogger(Handler.ERROR);
        Handler fileLogger = new FileLogger(Handler.DEBUG);
        Handler consoleLogger = new ConsoleLogger(Handler.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        //开始测试
        errorLogger.logMessage(Handler.INFO, "This is an information.");
        errorLogger.logMessage(Handler.DEBUG, "This is a debug level information.");
        errorLogger.logMessage(Handler.ERROR, "This is an error information.");
    }

}
