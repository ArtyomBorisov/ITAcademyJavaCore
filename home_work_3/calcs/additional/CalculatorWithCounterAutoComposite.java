package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private int countOperation;

    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calc) {
        this.calculatorWithOperator = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calc) {
        this.calculatorWithMathCopy = calc;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calc) {
        this.calculatorWithMathExtends = calc;
    }

    public CalculatorWithOperator getCalculatorWithOperator() {
        incrementCountOperation();
        return calculatorWithOperator;
    }

    public CalculatorWithMathCopy getCalculatorWithMathCopy() {
        incrementCountOperation();
        return calculatorWithMathCopy;
    }

    public CalculatorWithMathExtends getCalculatorWithMathExtends() {
        incrementCountOperation();
        return calculatorWithMathExtends;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    public int getCountOperation() {
        return this.countOperation;
    }
}
