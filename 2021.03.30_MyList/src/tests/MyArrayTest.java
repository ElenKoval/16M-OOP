package tests;

import interfaces.IList;
import model.MyArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyArrayTest {
    IList numbers;
    IList strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "gr", "abc"};

    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer i : arNumbers) {
            numbers.add(i);
        }
        strings = new MyArray();
        for (String s : arStrings) {
            strings.add(s);
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
    }

    @Test
    public void testRemoveAtIndex() {
        Integer[] arNumbers_2 = {10, 7, 11, 13, 10, 2000};
        assertEquals(-2, numbers.get(3));
        assertNull(numbers.remove(7));
        assertNull(numbers.remove(17));
        assertEquals(-2, numbers.remove(3));
        assertEquals(arNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
//            assertNotEquals(-2,numbers.get(i));
            assertEquals(arNumbers_2[i], numbers.get(i));
        }

    }

    @Test
    public void testRemoveObj() {
        assertTrue(numbers.remove((Integer)(7)));
        assertEquals(arNumbers.length-1,numbers.size());
        assertEquals(7, numbers.get(0));
        assertEquals(10,numbers.get(numbers.size()-2));
        assertFalse(numbers.remove((Integer)101));
        assertFalse(numbers.remove(null));
        assertFalse(numbers.remove("abc"));


    }

    @Test
    public void testIndexOf() {
        assertEquals(2, numbers.indexOf(11));
        assertNotEquals(2, numbers.indexOf(13));
        assertEquals(-1, numbers.indexOf(15));
        assertEquals(-1, numbers.indexOf(null));
        assertEquals(0, strings.indexOf("abc"));
        assertEquals(-1, strings.indexOf("lll"));

    }

    @Test
    public void testLastIndexOf() {
        assertEquals(2, numbers.lastIndexOf(11));
        assertNotEquals(2, numbers.lastIndexOf(13));
        assertEquals(-1, numbers.lastIndexOf(15));
        assertEquals(-1, numbers.lastIndexOf(null));
        assertEquals(3, strings.lastIndexOf("abc"));
        assertEquals(-1, strings.lastIndexOf("lll"));
    }

    @Test
    public void testContains() {
//        String[] arStrings = {"abc", "lmn", "gr", "abc"};
        //Idea подсказала вот такой вот вариант
        assertTrue(numbers.contains(11));
        assertFalse(numbers.contains(2));
        assertFalse(numbers.contains(null));

        assertTrue(strings.contains("abc"));
        assertFalse(numbers.contains("lll"));
        assertFalse(numbers.contains(null));
    }
    @Test
    public void testToArray() {
        Object[] exNumbers={10,7,11,-2,13,10,2000};
        Object[] exStrings={"abc", "lmn", "gr", "abc"};
        assertArrayEquals(exNumbers, numbers.toArray());
        assertArrayEquals(exStrings, strings.toArray());

    }
    @Test
    public void testClear() {
        numbers.clear();
        assertEquals(0, numbers.size());
        strings.clear();
        assertEquals(0,strings.size());
    }


    @Test
    public void testIterble() {
//        Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
        int index=0;
        for (Object o: numbers) {
            assertEquals(arNumbers[index++],o);
        }
        assertEquals(arNumbers.length,index);
    }
}



