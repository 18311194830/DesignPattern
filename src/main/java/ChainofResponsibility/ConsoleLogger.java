package ChainofResponsibility;

public class ConsoleLogger extends Handler {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
