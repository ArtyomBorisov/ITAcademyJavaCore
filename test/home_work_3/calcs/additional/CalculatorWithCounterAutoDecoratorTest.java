package test.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import test.home_work_3.calcs.api.ICalculatorTest;

public class CalculatorWithCounterAutoDecoratorTest implements ICalculatorTest {
    @Override
    public ICalculator iCalc() {
        return new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
    }
}
