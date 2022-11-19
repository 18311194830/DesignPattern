package Visitor;

/**
 * 抽象元素
 */
public abstract interface Place {
    public void accept(Visitor visitor);
}
