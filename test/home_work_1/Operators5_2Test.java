package test.home_work_1;

import home_work_1.Operators5_2;
import home_work_1.api.ICommunicationPrinter;
import test.home_work_1.api.ICommunicationPrinterTest;

public class Operators5_2Test implements ICommunicationPrinterTest {
    @Override
    public ICommunicationPrinter iCommunicationPrinter() {
        return new Operators5_2();
    }
}
