package test.home_work_2.txt.loops;

import home_work_2.txt.loops.Loops112;
import home_work_2.txt.loops.api.IFactorial;
import test.home_work_2.txt.loops.api.IFactorialTest;

public class Loops112Test implements IFactorialTest {
    @Override
    public IFactorial iFactorial() {
        return new Loops112();
    }
}
