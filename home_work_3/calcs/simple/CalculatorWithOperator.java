package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double plus (double a , double b) { return a + b; }

    public double minus (double a , double b) {
        return a - b;
    }

    public double multipl (double a , double b) {
        return a * b;
    }

    public double div (double a , double b) {
        return a / b;
    }

    public double degree (double a , int b) {
        double res = 1;
        if (b > 0) {

            for (int i = 0; i < b; i++) {
                res = res * a;
            }

            return res;
        } else if (b < 0) {
            b = - 1 * b;

            for (int i = 0; i < b; i++) {
                res = res * a;
            }

            return 1 / res;
        } else {
            return res;
        }
    }

    public double module (double a) {
        if (a >= 0) {
            return a;
        } else {
            return -1 * a;
        }
    }

    public double sqrt (double a) {
        return Math.sqrt(a);
    }
}
