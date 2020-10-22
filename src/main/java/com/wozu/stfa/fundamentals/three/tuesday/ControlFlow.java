package com.wozu.stfa.fundamentals.three.tuesday;

/* today we'll cover control flow
 * including if statements, loops, switch, etc
 */
public class ControlFlow {

    public Object o;

    public String myMethod(int input){
        if(input == 2){
           return "true";
        } else if (input == 3){
            return "that's my favorite number!";
        } else if (input == 4){
            return "that's an okay number...";
        } else {
            return "false";
        }
    }

    public String switchMethod(int input){
        switch (input){
            case 1: return "that's one";
            case 2: return "that's two";
            case 3:
                System.out.println("you need a break");
                break;
            case 4:
                return "that's four";
            default:
                return "default idk";
        }
        return "other default idk lol";
    }

    public String forMethod(){

        int[] ints = {1, 2, 3, 4, 5};

        for(int i = 1; i <= 5; i++){
            System.out.println("I am in a for loop!");
        }

        outer:
        for(int el : ints) {
            inner:
            for(int element : ints) {
//                System.out.println(el);
                if (el == 3) {
                    break outer;
                }
                System.out.println("I am after the continue");
            }
            System.out.println("I am outside of the inner for loop!");
        }

        return "nothing";
    }


    public static void main(String[] args) {
//        for(; ; ){
//            System.out.println("I am stuck here!");
//        }
        int x = 4;
        while(x == 4){
            System.out.println("I am stuck here!");
            x++;
        }

        do{
            System.out.println("am I stuck here?");
        }while(false);

    }


}
