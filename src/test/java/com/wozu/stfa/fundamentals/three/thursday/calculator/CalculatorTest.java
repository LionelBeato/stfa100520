package com.wozu.stfa.fundamentals.three.thursday.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {

    @Mock
    CalculatorService<Number> calculatorService;

    Calculator<Number> calculator;

    @BeforeEach
    void setUp(){
         calculator = new Calculator<>(calculatorService);
    }


    @Test
    void add() {
        // given 2 and 4
        // when add is called
        // then return 6

        Mockito.when(calculatorService.add(2, 4))
                .thenReturn(6);

        Number expected = 6;
        Number actual = calculator.add(2, 4);
        assertEquals(expected, actual);

    }


    @Test
    void testDivide(){
        Mockito.when(calculator.divide(9, 3))
                .thenReturn(3);

        Number expected = 3;
        Number actual = calculator.divide(9, 3);
        assertEquals(expected, actual);
    }
}