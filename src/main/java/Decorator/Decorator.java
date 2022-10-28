package Decorator;

/**
 * 抽象装饰
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
