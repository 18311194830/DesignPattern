package Iterator;

public interface Iterator {
    //判断是否还有下一个元素
    boolean hasNext();
    //获取第一个元素
    Object first();
    //获取下一个元素
    Object next();
}
