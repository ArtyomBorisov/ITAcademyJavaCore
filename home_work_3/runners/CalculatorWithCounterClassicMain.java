package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calculatorWithCounterClassic.multipl(15 , 7);
        calculatorWithCounterClassic.incrementCountOperation();

        double step2 = calculatorWithCounterClassic.div(28 , 5);
        calculatorWithCounterClassic.incrementCountOperation();

        double step3 = calculatorWithCounterClassic.degree(step2 , 2);
        calculatorWithCounterClassic.incrementCountOperation();

        double step4 = calculatorWithCounterClassic.plus(4.1 , step1);
        calculatorWithCounterClassic.incrementCountOperation();

        double step5 = calculatorWithCounterClassic.plus(step4 , step3);
        calculatorWithCounterClassic.incrementCountOperation();

        System.out.println(step5); // 140.45999999999998
        System.out.println(calculatorWithCounterClassic.getCountOperation()); // 5
    }
}
