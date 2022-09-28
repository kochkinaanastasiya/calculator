package com.calculator.calculator;

public interface CalculatorService {
    String welcome();

    int plus(int num1, int num2);
    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);
}
