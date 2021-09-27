package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    private int countOperation;

    ICalculator iCalculator;

    public int getCountOperation() {
        return this.countOperation;
    }

    public void incrementCountOperation() {
        this.countOperation++;
    }

    public CalculatorWithCounterAutoCompositeInterface (ICalculator iCalc) {
        this.iCalculator = iCalc;
    }

    public ICalculator getICalculator() {
        incrementCountOperation();
        return iCalculator;
    }
}
