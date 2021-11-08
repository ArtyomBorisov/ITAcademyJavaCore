package test.home_work_1;

import home_work_1.Operators5_1;
import home_work_1.api.ICommunicationPrinter;
import test.home_work_1.api.ICommunicationPrinterTest;

public class Operators5_1Test implements ICommunicationPrinterTest {
    @Override
    public ICommunicationPrinter iCommunicationPrinter() {
        return new Operators5_1();
    }
}
