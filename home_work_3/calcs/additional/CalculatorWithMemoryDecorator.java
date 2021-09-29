package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double valueInMemory;
    private double result;

    private ICalculator iCalculator;

    public CalculatorWithMemoryDecorator(ICalculator iCalc) {
        this.iCalculator = iCalc;
    }

    public ICalculator getCalculator() {
        return iCalculator;
    }

    public void saveValueInMemory() {
        this.valueInMemory = result;
    }

    public double getValueInMemory() {
        double returnValue = valueInMemory;
        valueInMemory = 0;
        return returnValue;
    }

    public double plus (double a , double b) {
        result = iCalculator.plus(a , b);
        return result;
    }

    public double minus (double a , double b) {
        result = iCalculator.minus(a , b);
        return result;
    }

    public double multipl (double a , double b) {
        result = iCalculator.multipl(a , b);
        return result;
    }

    public double div (double a , double b) {
        result = iCalculator.div(a , b);
        return result;
    }

    public double sqrt (double a) {
        result = iCalculator.sqrt(a);
        return result;
    }

    public double degree (double a , int b) {
        result = iCalculator.degree(a , b);
        return result;
    }

    public double module (double a) {
        result = iCalculator.module(a);
        return result;
    }
}
