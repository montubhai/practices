package com.test.Student;

import java.util.*;

public class Student {

    public static void main(String[] args) {
//    int ada[] = new int [1];a[0] = 1;
        System.out.println("Pankaj");
//        List<Integer>  newCountsNew = new ArrayList<Integer>();
        List<Integer> counts = Arrays.asList();
//        counts.add(1);
        System.out.println(counts);
        Human h = new Human("Soniji");
        System.out.println(h.getSuperName());

        Map<String, String> map = new HashMap<>();
        map.put("1","1");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        
    }

}

class Studen{
    public static void main(String[] args) {
        System.out.println("Soniji");
        int a = 0xDF;
        int b = 667;
        int C = 0b101010;
        System.out.println(a);
        System.out.println(b);
        System.out.println(C);
        a = main1(a);
        byte d = 5;
        d = (byte) (d + 1);
        System.out.println(a & d);



    }

    public static int main1(int a) {
        return a = 20;
    }
}

class Main extends Studnet {

    public static void main(String[] args) {
        Main s = new Main();
        s.getInstance();
    }

    @Override
    synchronized void getInstance() {
        System.out.println("getInstacne");
    }
}

abstract class  Studnet{
        abstract void getInstance();
}
class Person{

    private String name = "Soni";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Human extends Person{


    public String soni;

    public Human(String name) {
        super.getName();
    }


    public String getSuperName(){
        return super.getName();
    }
}