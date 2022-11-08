package Command;

public class ChangeCommand implements Command{

    private AirConditionerReceiver airConditionerReceiver;

    public ChangeCommand(AirConditionerReceiver airConditionerReceiver){
        super();
        this.airConditionerReceiver = airConditionerReceiver;
    }

    @Override
    public void execute() {
        airConditionerReceiver.change();
    }
}
