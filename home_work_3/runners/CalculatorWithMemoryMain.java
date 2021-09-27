package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        ICalculator iCalc = new CalculatorWithMathCopy();
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(iCalc);

        calculatorWithMemory.div(28.0 , 5);
        calculatorWithMemory.saveValueInMemory();
        calculatorWithMemory.degree(calculatorWithMemory.getValueInMemory() , 2);
        calculatorWithMemory.saveValueInMemory();
        calculatorWithMemory.plus(calculatorWithMemory.multipl(15.0 , 7) , calculatorWithMemory.getValueInMemory());
        calculatorWithMemory.saveValueInMemory();
        calculatorWithMemory.plus(4.1 , calculatorWithMemory.getValueInMemory());
        calculatorWithMemory.saveValueInMemory();

        System.out.println(calculatorWithMemory.getValueInMemory());
    }
}
