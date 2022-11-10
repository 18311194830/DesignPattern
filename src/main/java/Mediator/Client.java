package Mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1();
        concreteMediator.register(colleague1);
        ConcreteColleague2 colleague2 = new ConcreteColleague2();
        concreteMediator.register(colleague2);
        colleague1.send();
        System.out.println("==================");
        colleague2.send();
    }
}
