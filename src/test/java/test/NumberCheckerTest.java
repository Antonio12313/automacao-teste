package test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumberCheckerTest {

    private final NumberChecker checker = new NumberChecker();

    @Test
    public void testIsEven() {
        assertTrue(checker.isEven(4), "4 tem que ser par");
        assertFalse(checker.isEven(3), "3 não pode ser par");
    }

    @Test
    public void testIsOdd() {
        assertTrue(checker.isOdd(3), "3 tem que ser impar");
        assertFalse(checker.isOdd(4), "4 não pode ser impar");
    }
}
