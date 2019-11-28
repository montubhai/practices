package com.exception.questions;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/*
Method Overriding with Exception Handling::::

There are few things to remember when overriding a method with exception handling.
If super class method does not declare any exception,
then sub class overriden method cannot declare checked exception but it can declare unchecked exceptions.



*/
public class Super {

        void show() { System.out.println("parent class"); }

        void display() { System.out.println("parent class"); }

        void test() throws NullPointerException { System.out.println("parent class"); }

        void testing() throws NullPointerException { System.out.println("parent class"); }

    public static void main(String[] args) {
        HashSet<Super> supers = new HashSet<>(Collections.singletonList(new Child()));
        supers.add(new Child());
        System.out.println(supers);
        String initList[] = { "One", "Two", "three","Four", "five",};
        Collection collection = new ArrayList();
        List<String> src = new ArrayList<>(Collections.unmodifiableList(Arrays.asList(initList)));
        List<String> dest = new ArrayList<>(src);
//        src.stream()
//        src.add("Pankaj");
        System.out.println(src.size());
        System.out.println("PAnkaj"+"soni");
        System.out.println(src);

        Collections.copy(dest,src);
//        Collections.reverse(src);
        System.out.println(src);
        Collections.swap(src,3,0);
//        src.co
//        Collection.con(src,3,0);
//        Collections.indexOfSubList(src,3,0);
        List list = new ArrayList<>(supers);
//        System.out.println(dest);
        System.out.println(src);


        // create one list
        list = new ArrayList<>(Arrays.asList(initList));

        System.out.println("List value before: "+list);

        // create singleton list
        list = Collections.unmodifiableList(Arrays.asList(initList));

        //        list.add("five"); //throws UnsupportedOperationException
        System.out.println("List value after: "+list);
        int[] a = {1,2};

    }


}

class Child extends Super {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.forEach((a,b)->{
            System.out.println(hashMap.get(a));
        });

/*
* MAP replaceAll(), compute(), merge()
* */
    }


    /*
    * As the method show() doesn't throw any exception while in Super class,
    * hence its overridden version also cannot throw any checked exception.
    * */
//    void show() throws IOException {
    void show() {
        System.out.println("Pankaj");
    }

    /*
    * Because NullPointerException is an unchecked exception hence,
    * overrided display() method can throw it.
    * */
    void display () throws NullPointerException {
        System.out.println("Pankaj");
    }

    /*
    * If Super class method throws an exception,
    * then Subclass overriden method can throw the same exception or no exception,
    * but must not throw parent exception of the exception thrown by Super class method.
    * */
    void test() {

    }


    /*
    * It means, if Super class method throws object of NullPointerException class,
    * then Subclass method can either throw same exception, or can throw no exception,
    * but it can never throw object of Exception class (parent of NullPointerException class).*/
//    void testing() throws Exception {
    void testing() throws NullPointerException {

    }


}
