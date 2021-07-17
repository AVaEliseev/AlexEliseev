import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethodCalc {

    Calculator calculator = new Calculator();


    @Test(dataProvider = "additionValue", dataProviderClass = PropertyValue.additionValue.class)
    void assertionAdd(int first, int second, int expected) {
        Assert.assertEquals(calculator.add(first, second), expected);
    }

    @Test(dataProvider = "subtractionValue", dataProviderClass = PropertyValue.subtractionValue.class)
    public void assertionSubt(int first, int second, int expected) {
        Assert.assertEquals(calculator.subt(first, second), expected);
    }

    @Test(dataProvider = "divisionValue", dataProviderClass = PropertyValue.divisionValue.class)
    void assertionDiv(int first, int second, int expected) {
        Assert.assertEquals(calculator.div(first, second), expected);
    }

    @Test(dataProvider = "multiplyValue", dataProviderClass = PropertyValue.multiplyValue.class, invocationCount = 2)
    public void assertionMulti(int first, int second, int expected) {
        Assert.assertEquals(calculator.multi(first, second), expected);
    }
}
