package data;

import iterrators.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {
    private char[] array;

    public MyString(String str) {
        this.array = str.toCharArray();
    }

    @Override
    public String toString() {
        return array.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(array);
    }

}
