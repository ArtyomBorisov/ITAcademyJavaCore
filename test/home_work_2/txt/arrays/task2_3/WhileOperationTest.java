package test.home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.WhileOperation;
import home_work_2.txt.arrays.task2_3.api.IArraysOperation;
import test.home_work_2.txt.arrays.task2_3.api.IArraysOperationTest;

public class WhileOperationTest implements IArraysOperationTest {
    @Override
    public IArraysOperation iArraysOperation() {
        return new WhileOperation();
    }
}
