package rocks.zipcode;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

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

    @Test
    public void TestHashSet() {
        // add, remove, contains, size
        // retainAll (intersection)
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("b");
        set2.add("b");
        set2.add("c");
        set2.add("d");

        int expected = 2;

        int actual = set1.size();
        assertEquals(expected, actual);
        assertTrue(set2.contains("c"));

        set2.remove("c");
        assertFalse(set2.contains("c"));

        set1.retainAll(set2);
        actual = set1.size();
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void TestArrayList() {
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("a");
        myList.add("b");
        int expected = 3;

        assertEquals(expected, myList.size());
        assertFalse(myList.isEmpty());

        String actualStr = myList.get(2);
        String expectedStr = "b";
        assertEquals(expectedStr, actualStr);

        myList.set(0, "c");
        expectedStr = "c";
        actualStr = myList.get(0);
        assertEquals(expectedStr, actualStr);
    }

    @Test
    public void TestHashMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Alina", 45);
        myMap.put("Betty", 18);
        myMap.put("Don", 24);

        Integer actual = myMap.get("Don");
        Integer expected = 24;

        assertEquals(expected, actual);
        assertFalse(myMap.containsKey("don"));
        assertTrue(myMap.containsKey("Betty"));
        assertFalse(myMap.containsValue(17));
        assertTrue(myMap.containsValue(45));

        expected = 3;
        actual = myMap.size();
        assertEquals(expected, actual);
        assertTrue(myMap.isEmpty());
    }

    // TODO LinkedList, ArrayDeque, Vector,
    //  TreeMap, TreeSet, Iterator, PriorityQueue, Comparable
}
