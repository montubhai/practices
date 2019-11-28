package com.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test{
    public static void main (String [] args){
        List<Item> list = IntStream.rangeClosed(1, 4)
                .mapToObj(Item::new)
                .collect(Collectors.toList()); //[Item [i=1], Item [i=2], Item [i=3], Item [i=4]]

        Map<String, Item> map =
                list.stream().collect(Collectors.toMap(Item::getKey, item -> item));
//                list.stream().collect(Collectors.toMap(Item::getKey, item -> item));

        map.forEach((k, v) -> System.out.println(k + " => " + v));

        HashMap<String, String> map2 =
                list.stream().collect(Collectors.toMap(Item::getKey, //key for map
                        Item::getKey,    // value for map
                        (o,n) -> o,             // merge function in case of conflict with keys
                        HashMap::new));         // // map factory - we want HashMap and not
        System.out.println(map2);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(7);
        list1.add(9);
        list1.add(2);
        list1.add(111);
        list1.add(3);

        DoubleSummaryStatistics summaryStatistics = list1.stream().mapToDouble(e -> e).summaryStatistics();
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getSum()*1.0/summaryStatistics.getCount());

        Employee employee = new Employee(1l,"Pankaj");
        Employee employee1 = new Employee(2l,"Soni");



//        Map<Character, List<Integer>> idGroupedByAlphabet =
                Arrays.stream(new Employee[]{employee,employee1})
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.mapping(Test::mapper, Collectors.toList())));
    }

    private static EmployeeDTO mapper(Employee e) {
        return new EmployeeDTO(e.getId(),e.getName());
    }
}
class Item {

    private final int i;

    public Item(int i){
        this.i = i;
    }

    public String getKey(){
        return "Key-"+i;
    }

    @Override
    public String toString() {
        return "Item [i=" + i + "]";
    }
}

class Employee {

    private Long id;

    private String name;


    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeDTO {

    private Long id;

    private String name;


    public EmployeeDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}