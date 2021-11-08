package test.home_work_2.txt.arrays.task2_3;

import home_work_2.txt.arrays.task2_3.ForEachOperation;
import home_work_2.txt.arrays.task2_3.api.IArraysOperation;
import test.home_work_2.txt.arrays.task2_3.api.IArraysOperationTest;

public class ForEachOperationTest implements IArraysOperationTest {
    @Override
    public IArraysOperation iArraysOperation() {
        return new ForEachOperation();
    }
}
