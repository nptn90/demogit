package test.demo.collection;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {
        /**
         * HashMap: Key - Value
         * Not duplicated key. Not ordered.
         */
        Map<String, Integer> testHashMap = new HashMap<>();
        testHashMap.put("key 1", 1);
        testHashMap.put("key 2", 1);
        testHashMap.put("key 1", 2);
        testHashMap.put("key 3", 3);
        System.out.println("HashMap: " + testHashMap);

        /**
         * LinkedHashMap: Key - value
         * Not duplicated. Ordered
         */
        Map<String, Integer> testLinkedHashMap = new LinkedHashMap<>();
        testLinkedHashMap.put("key 1", 1);
        testLinkedHashMap.put("key 2", 1);
        testLinkedHashMap.put("key 1", 2);
        testLinkedHashMap.put("key 3", 3);
        System.out.println("LinkedHashMap: " + testLinkedHashMap);

        /**
         * TreeMap: Key - value
         * Not duplicated. Ordered, can change the order by custom Comparator.
         */
        Map<String, Integer> testSortedMap = new TreeMap<>(Comparator.reverseOrder());
        testSortedMap.put("key 1", 1);
        testSortedMap.put("key 2", 1);
        testSortedMap.put("key 1", 2);
        testSortedMap.put("key 3", 3);
        System.out.println("SortedMap: " + testSortedMap);

        /**
         * Test Custom key
         * Override Equals Hashcode
         */
        Map<TestObject, Integer> testCustomKey = new HashMap<>();
        testCustomKey.put(new TestObject("key 1", 1), 1);
        testCustomKey.put(new TestObject("key 2", 1), 1);
        testCustomKey.put(new TestObject("key 1", 1), 2);
        testCustomKey.put(new TestObject("key 3", 3), 3);
        System.out.println("TestCustomKey: " + testCustomKey.values());
    }

}
