package Decorator;

/**
 * 具体装饰类
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setScrollBar();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条...");
    }
}
