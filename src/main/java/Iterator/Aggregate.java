package Iterator;

public interface Aggregate {
    //添加对象
    void addObject(Object object);
    //移除对象
    void removeObject(Object object);
    //获取迭代器
    Iterator getIterator();
}
