package test.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.api.ICalculator;
import test.home_work_3.calcs.api.ICalculatorTest;

public class CalculatorWithCounterAutoSuperTest implements ICalculatorTest {
    @Override
    public ICalculator iCalc() {
        return new CalculatorWithCounterAutoSuper();
    }
}
