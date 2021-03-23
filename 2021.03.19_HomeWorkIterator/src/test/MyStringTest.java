package test;

import data.MyString;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    MyString ms = new MyString("Hello");
    char[] ex = {'H', 'e', 'l', 'l', 'o'};

    @Test
    public void test() {
        int count = 0;
        for (char c : ms) {
            assertEquals(ex[count++], c);
        }
    }

}