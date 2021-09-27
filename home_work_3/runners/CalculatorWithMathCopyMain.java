package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calculatorWithMathCopy.plus(4.1 , calculatorWithMathCopy.multipl(15 , 7));
        double step2 = calculatorWithMathCopy.degree(calculatorWithMathCopy.div(28.0 , 5) , 2);
        double step3 = calculatorWithMathCopy.plus(step1 , step2);

        System.out.println(step3); // 140.45999999999998
    }
}
