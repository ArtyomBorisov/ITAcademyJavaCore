package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double degree (double a , int b) { return Math.pow(a , b); }

    @Override
    public double module (double a) { return Math.abs(a); }

    @Override
    public double sqrt (double a) {
        return Math.sqrt(a);
    }
}
