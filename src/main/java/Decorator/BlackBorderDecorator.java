package Decorator;

public class BlackBorderDecorator extends Decorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    public void setBlackBorder() {
        System.out.println("为构建增加黑色边框...");
    }
}
