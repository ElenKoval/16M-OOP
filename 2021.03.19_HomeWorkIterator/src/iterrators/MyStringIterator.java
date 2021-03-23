package iterrators;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    private char[] array;
    private int size;
    private int position;

    public MyStringIterator(char[] array) {
        this.array = array;
        position = 0;
        size = array.length;
    }


    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public Character next() {
        return array[position++];
    }
}
