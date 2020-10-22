package com.wozu.stfa.fundamentals.three.thursday.calculator;

public class Calculator<T>  {


    private final CalculatorService<Number> calculatorService;


    public Calculator(CalculatorService<Number> calculatorService) {
        this.calculatorService = calculatorService;
    }

    public Number add(Number x, Number y){
       return calculatorService.add(x, y);
    }

    public Number divide(Number x, Number y){
        return calculatorService.div(x, y);
    }

}
