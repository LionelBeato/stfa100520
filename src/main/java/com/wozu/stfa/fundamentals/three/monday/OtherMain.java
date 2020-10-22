package com.wozu.stfa.fundamentals.three.monday;

import java.util.Arrays;

public class OtherMain {


    public static int[] arrayModifier(int[] input){
        int temp = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] != 0){
                input[temp++] = input[i];
            }
        }
        while(temp < input.length){
            input[temp++] = 0;
        }

        return input;
    }


    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        int[][] ints2D = new int[5][5];

        ints2D[0][0] = 1;

//        System.out.println(Arrays.deepToString(ints2D));
//
//        System.out.println(ints.length);
//
//        for(int i = 0; i < ints.length; i++){
//            System.out.println(ints[i]);
//        }
//
//        for(int el : ints){
//            System.out.println(el);
//        }

//        int[] intArray = {0,3,0,5,12};
        int[] input = new int[5];
        input[0] = 3;
        input[1] = 5;
        input[2] = 12;
        input[3] = 0;
        input[4] = 0;

        int[] inputs = {1, 0, 2, 0, 3, 3};
        int[] result = arrayModifier(inputs);

        for(int el: result){
            System.out.print(el);
        }

    }
}
