package comcsc205;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
         //SEAT

        //setup
        int expected = 4;
        int actual = new Calculator().add(a:2, b:2);

        //assertion
        assertEquals(expected: expected, actual: actual);
    }

    @Test
    void testAdd() {
    }

    @Test
    void subtract() {
    }
}