package Decorator;

/**
 * 具体构件
 */
public class Window extends Component{
    @Override
    public void display() {
        System.out.println("显示窗口....");
    }
}
