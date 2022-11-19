package Visitor;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarket {
    private Collection<Place> collection = new ArrayList<Place>();

    public void handleRequest(Visitor visitor) {
        // 循环对象结构中的元素，进行访问
        for (Place place : collection) {
            place.accept(visitor);
        }
    }

    // 示意方法，组建对象结构，向对象结构中添加元素
    public void addPlace(Place place) {
        this.collection.add(place);
    }
}
