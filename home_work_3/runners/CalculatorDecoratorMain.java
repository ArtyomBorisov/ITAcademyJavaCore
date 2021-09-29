package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        //ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()); // для проверки работы калькулятора с памятью

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double step1 = calc.multipl(15, 7);
        double step2 = calc.div(28, 5);
        double step3 = calc.degree(step2, 2);
        double step4 = calc.plus(4.1, step1);
        double step5 = calc.plus(step4, step3);

        System.out.println(step5);

        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calcWithCount = (CalculatorWithCounterAutoDecorator) calc;
            System.out.println("Количество использований " + calcWithCount.getCountOperation());
        } else if (calc instanceof CalculatorWithCounterAutoSuper) {
            CalculatorWithCounterAutoSuper calcWithCount = (CalculatorWithCounterAutoSuper) calc;
            System.out.println("Количество использований " + calcWithCount.getCount());
        }

        if (calc instanceof CalculatorWithMemoryDecorator) {
            CalculatorWithMemoryDecorator calcWithMemory = (CalculatorWithMemoryDecorator) calc;
            calcWithMemory.saveValueInMemory();
            System.out.println("Последнее сохранённое значение в памяти " + calcWithMemory.getValueInMemory());
        }
    }
}
