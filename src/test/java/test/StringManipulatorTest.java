package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    private final StringManipulator manipulator = new StringManipulator();

    @Test
    public void testConcatenate() {
        assertEquals("OiMundo", manipulator.concatenate("Oi", "Mundo"), "Concatenação falho");
    }

    @Test
    public void testGetLength() {
        assertEquals(3, manipulator.getLength("Ola"), "O tamanho tem que ser 3");
    }
}
