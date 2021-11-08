package test.home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import test.home_work_3.calcs.api.ICalculatorTest;

public class CalculatorWithMathCopyTest implements ICalculatorTest {
    @Override
    public ICalculator iCalc() {
        return new CalculatorWithMathCopy();
    }
}
