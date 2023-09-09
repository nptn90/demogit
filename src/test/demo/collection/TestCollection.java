package test.demo.collection;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        /** List
         * Can add duplicate
         * **/
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("abc");
        System.out.println("I'm a list: " + list);

        List<String> linkdedList = new LinkedList<>();
//        list = new LinkedList<>();
        linkdedList.add("abc");
        linkdedList.add("123");
        linkdedList.add("abc");
        System.out.println("I'm a linkedList: " + linkdedList);

        /** First in first out **/
        Queue<String> queue = new LinkedList<>();
        queue.add("abc");
        queue.add("def");
        System.out.println("peek: " + queue.peek());
        System.out.println("pool: " + queue.poll());
        System.out.println(queue);

        /** Last in first out **/
        Stack<String> Stack = new Stack<>();
        Stack.add("abc");
        Stack.add("def");
        Stack.add("123");
        System.out.println("peek: " + Stack.peek());
        System.out.println("pool: " + Stack.pop());
        System.out.println(Stack);

        /**
         * No duplicate
         * No keep order
         * **/
        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("123");
        set.add("abc");
        set.add("def");
        set.add("123");
        System.out.println("I'm a set: " + set);

        /**
         * No duplicate
         * **/
        Set<String> linkedHashset = new LinkedHashSet<>();
        linkedHashset.add("abc");
        linkedHashset.add("123");
        linkedHashset.add("abc");
        linkedHashset.add("def");
        linkedHashset.add("123");
        System.out.println("I'm a linkedHashset: " + linkedHashset);
    }
}
