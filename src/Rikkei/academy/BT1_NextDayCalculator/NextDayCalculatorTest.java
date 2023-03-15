package Rikkei.academy.BT1_NextDayCalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Ngay01/01/2018")
    void calNextDay01012018() {
        int first = 1;
        int second = 1;
        int third = 2018;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Ngay31/01/2018")
    void calNextDay31012018() {
        int first = 31;
        int second = 1;
        int third = 2018;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Ngay30/04/2018")
    void calNextDay30042018() {
        int first = 30;
        int second = 4;
        int third = 2018;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Ngay28/02/2018")
    void calNextDay28022018() {
        int first = 28;
        int second = 2;
        int third = 2018;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Ngay29/02/2020")
    void calNextDay29022020() {
        int first = 29;
        int second = 2;
        int third = 2020;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Ngay31/12/2018")
    void calNextDay31122018() {
        int first = 31;
        int second = 12;
        int third = 2018;
        LocalDate expected = LocalDate.of(third,second,first).plusDays(1);

        LocalDate result = NextDayCalculator.calNextDay(third,second,first);
        assertEquals(expected,result);
    }
}