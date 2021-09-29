package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private int countOperation;

    private ICalculator iCalculator;

    public int getCountOperation() {
        return this.countOperation;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator iCalc) {
        this.iCalculator = iCalc;
    }

    public ICalculator getCalculator() {
        return iCalculator;
    }

    public double degree (double a , int b) {
        incrementCountOperation();
        return this.iCalculator.degree(a , b);
    }

    public double module (double a) {
        incrementCountOperation();
        return this.iCalculator.module(a);
    }

    public double sqrt (double a) {
        incrementCountOperation();
        return this.iCalculator.sqrt(a);
    }

    public double div (double a , double b) {
        incrementCountOperation();
        return this.iCalculator.div(a , b);
    }

    public double multipl (double a , double b) {
        incrementCountOperation();
        return this.iCalculator.multipl(a , b);
    }

    public double minus (double a , double b) {
        incrementCountOperation();
        return this.iCalculator.minus(a , b);
    }

    public double plus (double a , double b) {
        incrementCountOperation();
        return this.iCalculator.plus(a , b);
    }
}
