package test.home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.ForOperation;
import home_work_2.txt.arrays.task2_3.api.IArraysOperation;
import test.home_work_2.txt.arrays.task2_3.api.IArraysOperationTest;

public class ForOperationTest implements IArraysOperationTest {
    @Override
    public IArraysOperation iArraysOperation() {
        return new ForOperation();
    }
}
