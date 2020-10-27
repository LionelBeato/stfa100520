package com.wozu.stfa.day11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {


    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned(){
        List<Object> list = new CustomList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned(){
        List<Object> list = new CustomList<>();
        list.add(null);

        assertFalse(list.isEmpty());
    }

    @Test
    public void givenListWithAnElement_whenSize_theOneIsReturned(){
        List<Object> list = new CustomList<>();
        list.add(null);

        assertEquals(1, list.size());
    }

    @Test
    public void givenListWithAnElement_whenGet_thenThatElementIsReturned(){
        List<Object> list = new CustomList<>();
        list.add("my element");
        Object element = list.get(0);
        assertEquals("my element", element);
    }

    @Test
    public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth(){
        List<Object> list = new CustomList<>();
        list.add("hello");
        list.add("world");
        Object element1 = list.get(0);
        Object element2 = list.get(1);

//        assertEquals("hello", element1);
//        assertEquals("world", element2);
        assertAll(
                () -> assertEquals("hello", element1),
                () -> assertEquals("world", element2)
        );
    }

}