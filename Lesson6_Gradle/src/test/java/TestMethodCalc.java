import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestMethodCalc {

    Calculator calculator = new Calculator();
    Double testNum = 6.0d;

    @Test
    @Tag("addition")
    public void assertionAdd() {
        Assertions.assertEquals(testNum, calculator.add(4.0d, 2.0d));
    }

    @Test
    @Tag("Subtraction")
    public void assertionSubt() {
        Assertions.assertEquals(testNum, calculator.subt(16.0d, 10.0d));
    }

    @Test
    @Tag("Division")
    public void assertionDiv() {
        Assertions.assertEquals(testNum, calculator.div(30.0d, 5.0d));
    }

    @RepeatedTest(2)
    @Tag("Multiply")
    public void assertionMulti(RepetitionInfo repetitionInfo) {
        Assertions.assertEquals(testNum, calculator.multi(2.0d, 3.0d));
        Assertions.assertEquals(2, repetitionInfo.getTotalRepetitions());
    }

    @ParameterizedTest
    @ValueSource(doubles = 4.0d)
    public void subtMulti(double actualValue){
        Assertions.assertEquals(20, calculator.subt(calculator.multi(testNum, actualValue), actualValue));
    }
}
