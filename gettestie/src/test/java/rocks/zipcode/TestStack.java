package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        String hello = "Hello world";
        String tacos = "Tacos soon.";

        stack.push(hello);
        stack.push(tacos);
        String actual = stack.pop();

        assertFalse(stack.isEmpty());
        assertEquals(tacos, actual);

        actual = stack.peek();
        assertEquals(hello, actual);

        stack.clear();
        assertTrue(stack.isEmpty());
    }

    // Make a bigger test exercising more Stack methods.....
}
