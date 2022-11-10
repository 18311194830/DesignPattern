package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    public void register(Colleague colleague) {
        colleague.setMediator(this);
        colleagues.add(colleague);

    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}
