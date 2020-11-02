package com.wozu.stfa.day14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    @Mock
    private List<Integer> list;


    @Test
    public void shouldDoSomething(){
        list.add(100);
        Mockito.when(list.get(0))
                .thenReturn(100);
        assertEquals(100, list.get(0));
    }




}
