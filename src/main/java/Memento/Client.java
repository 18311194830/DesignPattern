package Memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("状态 1");
        originator.setState("状态 2");
        careTaker.add(originator.save());
        originator.setState("状态 3");
        careTaker.add(originator.save());
        originator.setState("状态 4");

        System.out.println("当前状态："+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次保存时状态："+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存时状态："+originator.getState());
    }
}
