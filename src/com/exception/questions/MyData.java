package com.exception.questions;

import java.util.*;
import java.util.stream.Stream;

public class MyData implements My{

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null;
    }

    public static void main(String[] args) {
        MyData obj = new MyData();
        obj.print("a");
        obj.isNull("abc");

        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
//flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());

        flatStream.forEach(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            map.get(entry.getKey());
        }
//        for(Entity<String,String> entity: entries);
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        int newCapacity = 22 + (22 >> 1);
//        HashSet
        System.out.println(newCapacity);

        Integer a = new Integer(23);
        Integer b = new Integer(23);
        System.out.println(a==b);
        foo(null);
    }

    public static void foo(Object o) {
        System.out.println("Object impl");
    }
    public static void foo(String s) {
        System.out.println("String impl");
    }





}

interface My{

    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null || ("".equals(str));
    }
}
