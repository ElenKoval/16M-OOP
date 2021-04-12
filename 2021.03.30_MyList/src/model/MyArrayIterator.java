package model;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Object> {
    public MyArray array;
    private int size;
    private int position;

    public MyArrayIterator(MyArray array){
        this.array=array;
        size=array.size();
        position=0;
    }

    @Override
    public boolean hasNext() {
        return position<size;
    }

    @Override
    public Object next() {
        return array.get(position++);
    }
}
