import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMethodCalc {

    Calculator calculator = new Calculator();

    @ParameterizedTest(name = "{index} first={0}, second={1}, expected={2}")
    @CsvSource({
            "10, 15, 25",
            "6, 10 , 16",
            "0, 4 , 4",
            "1, 5 , 6"

    })
    @Tag("Addition")
    public void assertionAdd(int first, int second, int expected) {
        Assertions.assertEquals(expected, calculator.add(first, second));
    }

    @ParameterizedTest(name = "{index} first={0}, second={1}, expected={2}")
    @CsvSource({
            "6, 3 , 3",
            "6, 2 , 4",
            "18, 4 , 14",
            "10, 5 , 5"

    })
    @Tag("Subtraction")
    public void assertionSubt(int first, int second, int expected) {
        Assertions.assertEquals(expected, calculator.subt(first, second));
    }

    @ParameterizedTest(name = "{index} first={0}, second={1}, expected={2}")
    @CsvSource({
            "9, 3 , 3",
            "6, 2 , 3",
            "8, 4 , 2",
            "10, 5 , 2"

    })
    @Tag("Division")
    public void assertionDiv(int first, int second, int expected) {
        Assertions.assertEquals(expected, calculator.div(first, second));
    }

    @ParameterizedTest(name = "{index} first={0}, second={1}, expected={2}")
    @CsvSource({
            "1, 3 , 3",
            "6, 2 , 12",
            "8, 4 , 32",
            "10, 5 , 50"

    })
    @Tag("Multiply")
    public void assertionMulti(int first, int second, int expected) {
        Assertions.assertEquals(expected, calculator.multi(first, second));
        Assertions.assertNotEquals(expected, first);
    }
}
