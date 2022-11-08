package Iterator;

public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        ObjectAggregate objectAggregate = new ObjectAggregate();
        //在聚合对象中填充数据
        objectAggregate.addObject("我是伞兵一号");
        objectAggregate.addObject("我是伞兵二号");
        objectAggregate.addObject("我是伞兵三号");
        //获取迭代器
        Iterator iterator = objectAggregate.getIterator();
        //通过迭代器迭代数据
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
