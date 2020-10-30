package com.wozu.stfa.day20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyFuncTest {

    MyFunc takeTwoNumbers;
    DoThingWithStrings doThingWithStrings;
    String[] arr;
    Long x;
    ArrayList<String> stringArrayList;
    OtherFunc otherFunc;

    @BeforeEach
    void setUp(){

//        var myVar = "Hello world!";
//        var myOtherVar = 'c';

//        System.out.println(myVar);

//        myFunc = new MyFunc() {
//            @Override
//            public int sum(int a, int b) {
//                return 0;
//            }
//        };
        // this known as an anonymous function
        // arrow function
        // or lambda
        // (input) -> (output)
//        myFunc = (a, b) -> (a + b);
        takeTwoNumbers = Integer::sum;
        MyFunc myFunc1 = (a,b) -> a;
        MyFunc myFunc2 = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            return 2;
        };

        // below is a broken implementation of a lambda
        // lamba return statements need to be valid statements
//        PointlessFunc pointlessFunc = (a) -> (null);

        arr = new String[]{"a","b","c"};
        Stream<String> stream;
        stream = Stream.of("a", "b", "c");

        x = stream.count();
        stringArrayList = new ArrayList<>();
        stringArrayList.add("what");
        stringArrayList.add("whom");
        stringArrayList.add("where");
        stringArrayList.add("when");


//        doThingWithStrings = (a, b) -> String.join(a, b);
        doThingWithStrings = String::join;
        otherFunc = (args) -> Arrays.stream(args).sum();

    }


    @Test
    void test(){
        assertEquals(3, x);
    }

    @Test
    void listTest(){

//        stringArrayList.stream()
//                .forEach(string -> System.out.println(string));
        stringArrayList
                .forEach(System.out::println); // method reference, a shorthand for the lambda expression

        Stream.of(1, 2, 3, 4, 5)
                .filter(el -> el > 2)
//                .forEach(System.out::println);
                .close();

        Stream.of("Alvin", "Simon", "Theodore")
                .map(el -> el + " the chipmunk")
                .forEach(System.out::println);

        Stream.of("Alvin", "Simon", "Theodore")
                .filter(el -> el.equals("Alvin"))
                .map(el -> el.concat(" and the chipmunks"))
                .forEach(System.out::println);

//        int myInt = Stream.of(4, 3)
//                .



    }

}