package Command;

public class TrunoffCommand implements Command{

    private AirConditionerReceiver airConditionerReceiver;

    public TrunoffCommand(AirConditionerReceiver airConditionerReceiver){
        super();
        this.airConditionerReceiver =airConditionerReceiver;
    }

    @Override
    public void execute() {
        airConditionerReceiver.trunoff();
    }
}
