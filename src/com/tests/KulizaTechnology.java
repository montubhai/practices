package com.tests;

import java.util.Arrays;

public class KulizaTechnology {

    public static void main(String[] args) {

        int m[][] = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int a[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int b[][] = {{0, 2}};

        System.out.println(Arrays.toString(m));

        for (int[] i : m) {
            System.out.println(m);
        }

        System.out.println();
        solution(m, 5, 5);

    }

    private static void solution(int[][] m, int rows, int colums) {

        for (int i = 0; i < colums; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        int s = rows - 1;
        for (int i = 1; i < colums; i++) {
            int x = i;
            for (int j = s; j > 0; j--) {
                System.out.print(m[j][x] + " ");
                ++x;
            }
            s--;
            System.out.println();
        }
    }

}
