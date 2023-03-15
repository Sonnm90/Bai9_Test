package Rikkei.academy.TH2_AbsoluteValue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueTest {

    @Test
    @DisplayName("Testing find 0")
    void findAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteValue.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing find 1")
    void findAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteValue.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing find negative 1")
    void findAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteValue.findAbsolute(number);
        assertEquals(expected, result);
    }
}