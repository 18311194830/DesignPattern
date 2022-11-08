package Command;

public class TrunonCommand implements Command{

    private AirConditionerReceiver airConditionerReceiver;

    public TrunonCommand(AirConditionerReceiver airConditionerReceiver){
        super();
        this.airConditionerReceiver = airConditionerReceiver;
    }

    @Override
    public void execute() {
        airConditionerReceiver.trunon();
    }
}
