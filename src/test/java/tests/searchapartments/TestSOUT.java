package tests.searchapartments;

import org.testng.annotations.Test;

public class TestSOUT {
//    @Test(invocationCount = 2, timeOut = 5000, successPercentage = 80)
    @Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderClass.class)
    public void testSOUT(String  number, String string) { System.out.println("TEST SOUT!" + number + string); }


}
