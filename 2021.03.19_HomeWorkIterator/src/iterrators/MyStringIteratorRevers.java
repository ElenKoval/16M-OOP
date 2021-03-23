package iterrators;

import java.util.Iterator;

public class MyStringIteratorRevers implements Iterator<Character> {
    private char[] array;
    private int position;

    public MyStringIteratorRevers(char[] array) {
        this.array = array;
        position = array.length - 1;
    }


    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Character next() {
        return array[position--];
    }
}


