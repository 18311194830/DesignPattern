package ChainofResponsibility;

public class ErrorLogger extends Handler{

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void handleRequest(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
