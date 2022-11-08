package Command;

public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        System.out.println("智能家居为您服务~~~~");
        command.execute();
    }
}
