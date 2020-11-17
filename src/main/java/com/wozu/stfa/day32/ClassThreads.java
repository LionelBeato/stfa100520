package com.wozu.stfa.day32;

import java.util.Random;

import static java.lang.Thread.sleep;

public class ClassThreads {

    public static int randomInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {

        Runnable task1 = () -> {
//            int threadNum = randomInt(2,10);
            String name = Thread.currentThread().getName();
            System.out.printf("Thread %s is running...\n", name);
            try {
                sleep(randomInt(1000,5000)); // this method throws a checked exception, you need to handle it
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.printf("Thread %s is ending...\n", name);
            }
        };

        Thread thread = new Thread(task1);
        Thread threadTwo = new Thread(task1);
        Thread threadThree = new Thread(task1);
        Thread threadFour = new Thread(task1);
        Thread threadFive = new Thread(task1);

        thread.setName("Mikey");
        threadTwo.setName("Jim");
        threadThree.setName("Boris");
        threadFour.setName("Natasha");
        threadFive.setName("Rocky");


        // these will all resolve at different times
        // they are not guaranteed to resolve in the same order in which they were started

        thread.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();

    }
}
