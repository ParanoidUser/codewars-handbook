import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    var birthday = LocalDate.now();
    assertEquals("You are 2 days old", Kata.ageInDays(birthday.minusDays(2).getYear(), birthday.minusDays(2).getMonthValue(), birthday.minusDays(2).getDayOfMonth()));

    var pastYear = birthday.minusYears(1);
    boolean leapDay = birthday.getMonthValue() > 2 && birthday.isLeapYear() || birthday.getMonthValue() < 3 && pastYear.isLeapYear();
    String expected = String.format("You are %d days old", leapDay ? 366 : 365);
    assertEquals(expected, Kata.ageInDays(pastYear.getYear(), pastYear.getMonthValue(), pastYear.getDayOfMonth()));
  }
}