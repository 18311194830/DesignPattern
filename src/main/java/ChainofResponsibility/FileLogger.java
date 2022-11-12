package ChainofResponsibility;

public class FileLogger extends Handler{

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println("File::Logger: " + message);
    }
}
