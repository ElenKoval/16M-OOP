package app;

import data.MyString;
import iterrators.*;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {

        String stringIter = "HELLO WORLD";
        MyString myString = new MyString(stringIter);
        for (Character c : myString) {
            System.out.print(c + " ");
        }
        System.out.println();


        MyStringIterator it = new MyStringIterator(stringIter.toCharArray());
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();


        Iterator<Character> it2 = new MyStringIteratorRevers(stringIter.toCharArray());
        while (it2.hasNext()) {
            System.out.print(it2.next());
        }
        System.out.println();
    }
}
