package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calculatorWithOperator.multipl(15 , 7);
        double step2 = calculatorWithOperator.div(28 , 5);
        double step3 = calculatorWithOperator.degree(step2 , 2);
        double step4 = calculatorWithOperator.plus(4.1 , step1);
        double step5 = calculatorWithOperator.plus(step4 , step3);

        System.out.println(step5); // 140.45999999999998

    }
}
