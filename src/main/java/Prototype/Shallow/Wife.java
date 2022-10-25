package Prototype.Shallow;

public class Wife implements Cloneable{
    private int age = 20;
    private int height = 170;

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

    public Wife clone() throws CloneNotSupportedException {
        return (Wife) super.clone();
    }

    @Override
    public String toString() {
        return "Wife{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
