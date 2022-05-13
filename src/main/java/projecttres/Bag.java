package projecttres;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    ArrayList<T> Bag = new ArrayList<T>();

    @Override
    public boolean isEmpty() {
        return Bag.isEmpty();
    }
    @Override
    public int size() {
        return Bag.size();
    }
    @Override
    public void add(T item) {
        Bag.add(item);
    }
    @Override
    public Iterator<T> iterator() {
        return Bag.iterator();









    }


























}
