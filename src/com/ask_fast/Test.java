package com.ask_fast;

public class Test {

    public static void main(String[] args) {

        String a = "000111111100111000";
      /*  char[] chars = a.toCharArray();
        boolean deng = false;
        int inc = 0;
        int test = 0;

        test1:for (int i = 0; i < chars.length; i+=test) {
            test =1;
            for (int j = i + 1; j < chars.length && j <= i + 6 ; j++) {
                if(chars[i]==chars[j]){
                    test++;
                } else {
                    test = test;
                  break;
                }

                if(test==7){
                    deng = true;
                     break test1;
                }
            }
        }*/
        solution(a);


    }

    public static void solution(String S){
        //
        // write your logic here and print the desired output
        //
        char[] arr = S.toCharArray();
        boolean den = false;
        int test = 0;
        test1:for(int i = 0; i<arr.length;i+=test){
            test =1;
            for(int j = i+1; j<arr.length && j<=i+6; j++){
                if(arr[i]== arr[j]){
                    test++;
                }else{
                    break;
                }

                if(test==7){
                    den = true;
                    break test1;
                }
            }
        }

        if(den){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}


