package Prototype.Deep;

import java.io.Serializable;

public class Param implements Serializable {
    private int age = 20;
    private int height = 165;

    public Param(int age, int height) {
        this.age = age;
        this.height = 165;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Param{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
