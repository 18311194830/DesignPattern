package Command;

public class Client {
    public static void main(String[] args) {
        AirConditionerReceiver airConditionerReceiver = new AirConditionerReceiver();
        Command trunonCommand = new TrunonCommand(airConditionerReceiver);
        Command changeCommand = new ChangeCommand(airConditionerReceiver);
        Command trunoffCommand = new TrunoffCommand(airConditionerReceiver);

        Invoker trunonInvoker = new Invoker(trunonCommand);
        trunonInvoker.action();
        Invoker changeInvoker = new Invoker(changeCommand);
        changeInvoker.action();
        Invoker trunoffInvoker = new Invoker(trunoffCommand);
        trunoffInvoker.action();
    }
}
