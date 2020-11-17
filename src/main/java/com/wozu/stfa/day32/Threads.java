package com.wozu.stfa.day32;


import static java.lang.Thread.sleep;

/**
 *
 * References:
 * https://www.baeldung.com/java-start-thread
 * https://www.baeldung.com/java-generating-random-numbers-in-range
 * https://commons.apache.org/proper/commons-lang/javadocs/api-3.9/org/apache/commons/lang3/RandomStringUtils.html
 * https://www.codejava.net/java-core/the-java-language/java-8-lambda-runnable-example
 *
 * */
public class Threads {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {

        /* elegant way of invoking a Runnable
         *
         */
        Runnable task1 = () -> {
//            String name = RandomStringUtils.randomAlphabetic(5);
            String name = Thread.currentThread().getName();
            System.out.printf("Thread %s starting...\n", name); // format syntax
            try {
                sleep(getRandomNumber(100, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.printf("Thread %s ending...\n", name);
            }
        };

        //
        /* declaring and initializing threads
         *
         */
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);
        Thread thread3 = new Thread(task1);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
