package Rikkei.academy.BT1_NextDayCalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class NextDayCalculator {
    public static LocalDate calNextDay(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.plusDays(1);
    }
}
