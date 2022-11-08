package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ObjectAggregate implements Aggregate{

    private List<Object> list = new ArrayList<>();

    @Override
    public void addObject(Object object) {
        list.add(object);
    }

    @Override
    public void removeObject(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ObjectIterator(list);
    }
}
