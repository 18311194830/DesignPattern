package Prototype.Deep;



public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Wife wife = new Wife();
        wife.setParam(new Param(20,165));
        Wife wife1 = wife.clone();
        wife1.getParam().setHeight(175);
        System.out.println(wife.getParam().toString());
        System.out.println(wife1.getParam().toString());
    }
}
