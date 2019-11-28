package com.tests;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CrestDataOne {

    public void test(){

    }

    public static void test(String s){

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] o = new int[2];
        o[0] = s.nextInt(); // cities
        o[1] = s.nextInt(); // roads

        List<int[]> res = new ArrayList<int[]>();
        int[] va;
        for (int i = 0; i < o[1]; i++) {
            va = new int[2];
            va[0] = s.nextInt();
            va[1] = s.nextInt();
            res.add(va);
        }

        Set<int[]> collect = res.stream().filter(e -> e[0] != e[1]).collect(Collectors.toSet());
        Set<Integer> allRoads = new HashSet<>();
        for (int[] a : collect) {
            allRoads.add(a[0]);
            allRoads.add(a[1]);
        }

        int trollCount = 1;
        int temp = 0;
        for (int i = 0; i < res.size(); i++) {
            temp = 0;
            int[] ints = res.get(i);
            ++temp;
            for (int j = i; j < res.size(); j++) {
                int[] ints1 = res.get(j);
                if (ints[0] != ints1[0]) {
                    ++temp;
                }
                if (ints[0] != ints1[1]) {
                    ++temp;
                }
            }
            if (trollCount > temp) {
                System.out.println(ints[0]);
                trollCount = temp;
            }
        }
    }



}

class SelectionSort{
    public static int[] sortArray( int arr[] ){
        int x = 0 , y = 0 , n = arr.length;
        for( x = 0 ; x < n ; x ++ ){
            int index_of_min = x;
            for( y = x ; y < n ; y ++ ){
                if(arr[index_of_min]>arr[y]){
                    index_of_min = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[index_of_min];
            arr[index_of_min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = sortArray(new int[]{3, 2, 1});
        System.out.println(Arrays.toString(ints));

        float pow = (float) Math.pow(5, 2);
        float pow1 = (float)Math.pow(5, -2);
        System.out.println(pow);
        System.out.println(pow1);
    }

    public static int matrixSum(int[][] matrix)
    {
       /* if(!(LocalDate.now().getMonth().equals() =.toString().) && LocalDate.now().getDayOfMonth() == )


            return 1;

        else;*/
        return 0;
    }

}