package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calculatorWithCounterAutoSuper.multipl(15, 7);
        double step2 = calculatorWithCounterAutoSuper.div(28, 5);
        double step3 = calculatorWithCounterAutoSuper.degree(step2, 2);
        double step4 = calculatorWithCounterAutoSuper.plus(4.1, step1);
        double step5 = calculatorWithCounterAutoSuper.plus(step4, step3);

        System.out.println(step5); // 140.45999999999998
        System.out.println(calculatorWithCounterAutoSuper.getCount()); // 5
    }
}
