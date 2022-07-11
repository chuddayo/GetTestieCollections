package rocks.zipcode;

import org.junit.*;
import sun.awt.image.ImageWatched;

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

    @Test
    public void TestLinkedList() {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("F");
        myList.add("E");
        myList.add("D");
        myList.add("E");
        myList.add("X");

        assertEquals(5, myList.size());
        assertEquals("D", myList.get(2));

        myList.addFirst("A");
        assertEquals("A", myList.get(0));
        assertNotEquals("D", myList.get(2));

        myList.removeLast();
        assertEquals("E", myList.get(myList.size()-1));
    }

    @Test
    public void TestArrayDeque() {
        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.add("F");
        myDeque.add("E");
        myDeque.add("D");
        myDeque.add("E");
        myDeque.add("X");

        assertEquals(5, myDeque.size());
        assertNotEquals("D", myDeque.peekFirst());
        assertEquals("F", myDeque.peekFirst());

        myDeque.addFirst("A");
        assertEquals("A", myDeque.peekFirst());
        assertEquals("X", myDeque.peekLast());

        myDeque.removeLast();
        assertEquals("E", myDeque.peekLast());
    }

    @Test
    public void TestVector() {
        // return when we understand multiple threads / synchronization
    }

    @Test
    public void TestTreeMap() {
        Map<String, Integer> myTree = new TreeMap<>();
        myTree.put("Don", 24);
        myTree.put("Alina", 45);
        myTree.put("Betty", 18);
        Iterator<Map.Entry<String, Integer>> iterator = myTree.entrySet().iterator();

        Map.Entry<String, Integer> myEntry = iterator.next();
        Integer actual = myEntry.getValue();
        Integer expected = 45;

        assertEquals(expected, actual);
    }

    @Test
    public void TestTreeSet() {
        // first, pollFirst, higher, floor
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(3);
        myTreeSet.add(7);
        myTreeSet.add(2);
        myTreeSet.add(13);

        Integer expected = 2;
        Integer actual = myTreeSet.first();
        assertEquals(expected, actual);

        myTreeSet.remove(2);
        actual = myTreeSet.pollFirst();
        assertNotEquals(expected, actual);

        expected = 7;
        actual = myTreeSet.higher(6);
        assertEquals(expected, actual);
    }

    @Test
    public void TestIterator() {
        Collection<Integer> myCollection = new LinkedList<>();
        myCollection.add(5);
        myCollection.add(7);
        myCollection.add(1);
        myCollection.add(3);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer actual = iterator.next();
            assertTrue(actual <= 7 && actual >= 1);
        }
    }

    // TODO PriorityQueue, Comparable
}
