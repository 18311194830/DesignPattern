package Decorator;

public class Client {
    public static void main(String[] args) {
        Component window = new Window();
        window.display();
        Component textBox = new TextBox();
        textBox.display();
        Component listBox = new ListBox();
        listBox.display();

        System.out.println("===========================================");
        window = new ScrollBarDecorator(window);
        window.display();
        window = new BlackBorderDecorator(window);
        window.display();

        System.out.println("===========================================");
        textBox = new BlackBorderDecorator(new ScrollBarDecorator(listBox));
        textBox.display();
    }
}

