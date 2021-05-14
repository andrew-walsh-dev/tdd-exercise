package tdd_exercise;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test
    public void testAdd(){
        assertEquals(App.add(2, 3), 5);
    }
    @Test
    public void testSubtract(){
        assertEquals(App.subtract(12, 7), 5);
    }
    @Test
    public void isEmpty(){
        assertTrue(App.isEmpty(""));
        assertFalse(App.isEmpty("abc"));
    }
} 
