package model;

import interfaces.IList;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MyArrayListTest {
    static IList<Integer> list;
    static int startSize;

    @BeforeAll
    static void setUpBeforeAll() {
        startSize = 5;
        list = new MyArrayList<>(startSize);
    }

    @BeforeEach
    void setUp() {
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(2);
    }
    @Test
     public void isEmpty(){
        assertFalse(list.isEmpty());
     }

    @Test
    public void size() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void get() {
    }

    @Test
    public void set() {
    }

    @Test
    public void add() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void clear() {
    }
}