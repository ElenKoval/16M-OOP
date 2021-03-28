package tests;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList<String> listForTest = new ArrayList<>();
    ArrayList<String> secondList = new ArrayList<>();


//    @Before
//    public void setUp() throws Exception {
//        ArrayList<String> listForTest = new ArrayList<>();
//        ArrayList<String> secondList = new ArrayList<>();
//    }

    @Test
    public void testListIsEmpty() {
        assertTrue(listForTest.isEmpty());
    }


    @Test
    public void testListSize() {
        listForTest.add("aaa");
        assertEquals(1, listForTest.size());
        listForTest.add(0, "bbb");
        assertEquals(2, listForTest.size());
    }

    @Test
    public void testListSet() {
        listForTest.add("aaa");
        assertEquals("aaa", listForTest.get(0));
        listForTest.set(0, "New");
        assertEquals("New", listForTest.get(0));
    }

    @Test
    public void testIndexOf() {
        listForTest.add("aaa");
        assertEquals(0, listForTest.indexOf("aaa"));
        assertEquals(-1, listForTest.indexOf("ggg"));
    }

    @Test
    public void testLastIndexOf() {
        listForTest.add("aaa");
        listForTest.add("aaa");
        listForTest.add("bbb");
        assertEquals(1, listForTest.lastIndexOf("aaa"));
        assertEquals(-1, listForTest.lastIndexOf("ggg"));
    }

    @Test
    public void testContains() {
        listForTest.add("aaa");
        listForTest.add("bbb");
        assertTrue(listForTest.contains("aaa"));
        assertFalse(listForTest.contains("hhh"));
        assertFalse(listForTest.contains(null));

    }

    @Test
    public void testAddAll() {
        listForTest.add("aaa");
        listForTest.add("bbb");
        listForTest.addAll(secondList);
        assertEquals(0, listForTest.indexOf("aaa"));
        secondList.add("kkk");
        secondList.add("lll");
        listForTest.addAll(0, secondList);
        assertEquals(0, listForTest.indexOf("kkk"));
        assertEquals(4, listForTest.size());

    }

    @Test
    public void testRemove() {
        listForTest.add("aaa");
        listForTest.add("bbb");
        assertEquals("aaa", listForTest.remove(0));
        assertEquals(0, listForTest.indexOf("bbb"));
    }

    @Test
    public void testRemoveAll() {
        listForTest.add("aaa");
        listForTest.add("bbb");
        secondList.add("kkk");
        secondList.add("lll");
        listForTest.addAll(secondList);
        listForTest.removeAll(secondList);
        assertEquals(2, listForTest.size());
        assertEquals("aaa", listForTest.get(0));
    }

    @Test
    public void testClear() {
        listForTest.add("aaa");
        listForTest.add("bbb");
        listForTest.clear();
        assertEquals(0, listForTest.size());
    }
}
