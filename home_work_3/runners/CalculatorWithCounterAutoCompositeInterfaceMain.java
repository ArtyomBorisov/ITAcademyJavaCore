package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        ICalculator iCalculator = new CalculatorWithOperator();

        CalculatorWithCounterAutoCompositeInterface calculatorWithCounterAutoCompositeInterface = new CalculatorWithCounterAutoCompositeInterface(iCalculator);

        double step1 = calculatorWithCounterAutoCompositeInterface.getICalculator().multipl(15, 7);
        double step2 = calculatorWithCounterAutoCompositeInterface.getICalculator().div(28, 5);
        double step3 = calculatorWithCounterAutoCompositeInterface.getICalculator().degree(step2, 2);
        double step4 = calculatorWithCounterAutoCompositeInterface.getICalculator().plus(4.1, step1);
        double step5 = calculatorWithCounterAutoCompositeInterface.getICalculator().plus(step4, step3);

        System.out.println("Ответ " + step5 + "\nКоличество использований калькулятора: " + calculatorWithCounterAutoCompositeInterface.getCountOperation());
    }
}
