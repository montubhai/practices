package com.exception.questions;

import java.util.ArrayList;
import java.util.List;

public class Singleton {


    public static void main(String[] args) {
        AB s = new AB();
        s.defaultMethod();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
//        test(list);
        //        AB.test();
//        System.out.println("s = " +s.test());
//        System.out.println(s==s1);
    }

    public static void test(List<Number> list){

    }
}

class AB extends I1 {


    public void defaultMethod(){

        System.out.println("DefaultMethodInterface2");
    };


    /*  static int test(){
        System.out.println("inside test I");
        return 1;
    }
*/


}

class I extends I1 {
    /*
        static int test(){
            System.out.println("inside test");
            return 1;
        }
    */
    public void defaultMethod() {
        System.out.println("DefaultMethodInterface");
    }
}

class I1 {
/*
    static int test(){
        System.out.println("inside test");
        return 1;
    }
*/

    public void defaultMethod(){

        System.out.println("DefaultMethodInterface2");
    };

    /*{
    }*/
}