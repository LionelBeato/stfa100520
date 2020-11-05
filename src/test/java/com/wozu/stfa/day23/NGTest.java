package com.wozu.stfa.day23;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NGTest {



//    @Test
//    void test() {
//        assertEquals(4, 4);
//    }

    @Test
    @Parameters("test")
    void test(String test){
        System.out.println(test);
    }

}
