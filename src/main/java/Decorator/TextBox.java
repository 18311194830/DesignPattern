package Decorator;

/**
 * 具体构件
 */
public class TextBox extends Component{
    @Override
    public void display() {
        System.out.println("显示文本框....");
    }
}
