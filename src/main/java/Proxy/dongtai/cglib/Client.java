package Proxy.dongtai.cglib;

import Proxy.dongtai.jdk.Cat;
import Proxy.dongtai.jdk.Doctor;
import Proxy.dongtai.jdk.Dog;
import Proxy.dongtai.jdk.Student;

public class Client {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy(new Student("张三"));
        Student student = (Student) proxy.getProxy();
        student.wakeup();
        student.sleep();

        proxy = new CglibProxy(new Doctor("王教授"));
        Doctor doctor = (Doctor) proxy.getProxy();
        doctor.wakeup();
        doctor.sleep();

        proxy = new CglibProxy(new Dog("旺旺"));
        Dog dog = (Dog) proxy.getProxy();
        dog.wakeup();
        dog.sleep();

        proxy = new CglibProxy(new Cat("咪咪"));
        Cat cat = (Cat) proxy.getProxy();
        cat.wakeup();
        cat.sleep();
    }
}
