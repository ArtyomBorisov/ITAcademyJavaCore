package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calculatorWithMathExtends.plus(4.1, calculatorWithMathExtends.multipl(15, 7));
        double step2 = calculatorWithMathExtends.degree(calculatorWithMathExtends.div(28.0, 5), 2);
        double step3 = calculatorWithMathExtends.plus(step1, step2);

        System.out.println(step3); // 140.45999999999998
    }
}
