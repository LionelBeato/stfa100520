package com.wozu.stfa.fundamentals.one;


public class Main {

    // field is the term for class members/variables
    // this class can be stateful with static members
    public static int x = 5;

    // this field cannot be directly accessed because its private
    // we need some form of encapsulation to access it
    private int z = 3;

    public int getZ(){
        return z;
    }

    public static void myMethod(){
        // this is a local variable
        // this belongs to the scope of the method myMethod
        int y = 5;
    }

    // your main method is considered the entrypoint
    // public is your access modifier
    // static means that this code belongs to the class implementation/state
    public static void main(String[] args){

        // this is instantiation
        // creates an instance
        Main myMain = new Main();
        Main otherMain = new Main();
//        System.out.println(myMain.x);
//        System.out.println(myMain.z);
//        System.out.println(otherMain.x);
//        System.out.println(Main.x);

        Wall northWall = new Wall("red", false);
        Wall southWall = new Wall("red", false);
        System.out.println(northWall.getAmountOfWalls());

    }

}
