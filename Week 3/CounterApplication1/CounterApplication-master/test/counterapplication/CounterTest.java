/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package counterapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mo03ib
 */
public class CounterTest {
    
    /**
     * Test of increment method, of class Counter.
     */
    @Test
    public void testIncrement() {
        System.out.println("Testing increment()");
        Counter instance = new Counter();
        instance.increment();
        assertEquals("Increment failed!", instance.value(), 1);
        instance.increment();
        assertEquals("Increment failed!", instance.value(), 2);
    }

    /**
     * Test of reset method, of class Counter.
     */
    @Test
    public void testReset() {
        System.out.println("Testing reset()");
        Counter instance = new Counter();
        instance.increment();
        instance.increment();
        instance.reset();
        assertEquals("Reset failed!", instance.value(), 0);
    }
}