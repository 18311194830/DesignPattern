package Iterator;

import java.util.List;

public class ObjectIterator implements Iterator {

    private List<Object> list;

    private int position = 0;

    public ObjectIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Object first() {
        return list.get(0);
    }

    @Override
    public Object next() {
        return list.get(position++);
    }
}
