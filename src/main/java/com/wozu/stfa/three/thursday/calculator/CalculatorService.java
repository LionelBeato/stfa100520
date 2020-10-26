package com.wozu.stfa.three.thursday.calculator;

public interface CalculatorService<T extends Number> {
    T add(T x, T y);
    T sub(T x, T y);
    T mult(T x, T y);
    T div(T x, T y);
}
