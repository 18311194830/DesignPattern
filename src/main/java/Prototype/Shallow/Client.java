package Prototype.Shallow;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Wife wife = new Wife();
        Wife wife1 = wife.clone();
        wife1.setHeight(175);
        System.out.println(wife);
        System.out.println(wife1);
    }
}
