package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite1 = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite2 = new CalculatorWithCounterAutoComposite(calculatorWithOperator);
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite3 = new CalculatorWithCounterAutoComposite(calculatorWithMathExtends);


        double step1 = calculatorWithCounterAutoComposite1.getCalculatorWithMathCopy().multipl(15, 7);
        double step2 = calculatorWithCounterAutoComposite1.getCalculatorWithMathCopy().div(28, 5);
        double step3 = calculatorWithCounterAutoComposite1.getCalculatorWithMathCopy().degree(step2, 2);
        double step4 = calculatorWithCounterAutoComposite1.getCalculatorWithMathCopy().plus(4.1, step1);
        double step5 = calculatorWithCounterAutoComposite1.getCalculatorWithMathCopy().plus(step4, step3);
        System.out.println("CalculatorWithMathCopy\nОтвет " + step5 + "\nКоличество использований калькулятора: " + calculatorWithCounterAutoComposite1.getCountOperation());


        step1 = calculatorWithCounterAutoComposite2.getCalculatorWithOperator().multipl(15, 7);
        step2 = calculatorWithCounterAutoComposite2.getCalculatorWithOperator().div(28, 5);
        step3 = calculatorWithCounterAutoComposite2.getCalculatorWithOperator().degree(step2, 2);
        step4 = calculatorWithCounterAutoComposite2.getCalculatorWithOperator().plus(4.1, step1);
        step5 = calculatorWithCounterAutoComposite2.getCalculatorWithOperator().plus(step4, step3);
        System.out.println("\nCalculatorWithOperator\nОтвет " + step5 + "\nКоличество использований калькулятора: " + calculatorWithCounterAutoComposite2.getCountOperation());


        step1 = calculatorWithCounterAutoComposite3.getCalculatorWithMathExtends().multipl(15, 7);
        step2 = calculatorWithCounterAutoComposite3.getCalculatorWithMathExtends().div(28, 5);
        step3 = calculatorWithCounterAutoComposite3.getCalculatorWithMathExtends().degree(step2, 2);
        step4 = calculatorWithCounterAutoComposite3.getCalculatorWithMathExtends().plus(4.1, step1);
        step5 = calculatorWithCounterAutoComposite3.getCalculatorWithMathExtends().plus(step4, step3);
        System.out.println("\nCalculatorWithMathExtends\nОтвет " + step5 + "\nКоличество использований калькулятора: " + calculatorWithCounterAutoComposite3.getCountOperation());
    }
}
