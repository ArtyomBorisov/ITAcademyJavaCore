package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double plus (double a , double b) { return a + b; }

    public double minus (double a , double b) {
        return a - b;
    }

    public double multipl (double a , double b) {
        return a * b;
    }

    public double div (double a , double b) {
        return a / b;
    }

    public double degree (double a , int b) { return Math.pow(a , b); }

    public double module (double a) { return Math.abs(a); }

    public double sqrt (double a) {
        return Math.sqrt(a);
    }
}
