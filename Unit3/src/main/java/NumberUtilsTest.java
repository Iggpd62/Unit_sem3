import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Задание 1
public class NumberUtilsTest {

    @Test
    public void testEvenNumber() {
        boolean result = NumberUtils.evenOddNumber(4);
        Assertions.assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        boolean result = NumberUtils.evenOddNumber(7);
        Assertions.assertFalse(result);
    }

    @Test
    public void testZero() {
        boolean result = NumberUtils.evenOddNumber(0);
        Assertions.assertTrue(result);
    }

    @Test
    public void testNegativeEvenNumber() {
        boolean result = NumberUtils.evenOddNumber(-2);
        Assertions.assertTrue(result);
    }

    @Test
    public void testNegativeOddNumber() {
        boolean result = NumberUtils.evenOddNumber(-5);
        Assertions.assertFalse(result);
    }

// Задание 2

    @Test
    public void testNumberInInterval() {
        boolean result = NumberUtils.numberInInterval(50);
        Assertions.assertTrue(result);
    }

    @Test
    public void testNumberBelowInterval() {
        boolean result = NumberUtils.numberInInterval(10);
        Assertions.assertFalse(result);
    }

    @Test
    public void testNumberAboveInterval() {
        boolean result = NumberUtils.numberInInterval(200);
        Assertions.assertFalse(result);
    }

    @Test
    public void testNumberEqualToLowerBound() {
        boolean result = NumberUtils.numberInInterval(25);
        Assertions.assertFalse(result);
    }

    @Test
    public void testNumberEqualToUpperBound() {
        boolean result = NumberUtils.numberInInterval(100);
        Assertions.assertFalse(result);
    }
}
