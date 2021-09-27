package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long count;

    @Override
    public double degree (double a , int b) {
        incrementCountOperation();
        return super.degree(a , b);
    }

    @Override
    public double module (double a) {
        incrementCountOperation();
        return super.module(a);
    }

    @Override
    public double sqrt (double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }

    @Override
    public double div (double a , double b) {
        incrementCountOperation();
        return super.div(a , b);
    }

    @Override
    public double multipl (double a , double b) {
        incrementCountOperation();
        return super.multipl(a , b);
    }

    @Override
    public double minus (double a , double b) {
        incrementCountOperation();
        return super.minus(a , b);
    }

    @Override
    public double plus (double a , double b) {
        incrementCountOperation();
        return super.plus(a , b);
    }

    public void incrementCountOperation() {
        this.count++;
    }

    public long getCount() {
        return this.count;
    }
}
