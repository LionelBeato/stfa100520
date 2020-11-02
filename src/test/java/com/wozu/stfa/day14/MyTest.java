package com.wozu.stfa.day14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MyTest {

    @Mock
    private List<Integer> list;

    @Test
    void testList(){
        list.add(100);
//        Integer actual = list.get(0);
        Mockito.when(list.get(4))
                .thenReturn(567);
//        System.out.println(list.get(0));
        assertEquals(100, list.get(4));
    }

}
