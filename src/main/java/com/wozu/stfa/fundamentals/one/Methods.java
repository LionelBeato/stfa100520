package com.wozu.stfa.fundamentals.one;

public class Methods {

    // void
    public static Integer myMethod (Integer x){
        // x is your parameter variable
        return x + 2;
    }

    public static Wall returnWall(Wall wall){
        return wall;
    }

    public void deleteWall(Long id){
        // code that gets WallRepo object by id
        // remove().. something like that
    }

    public static void main(String[] args) {
        Integer y = myMethod(5);
        System.out.println(y);

        Wall myWall = returnWall(new Wall());
        System.out.println(myWall);
    }

}
