
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Year;
import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    var birthday = LocalDate.now();
    assertEquals("You are 2 days old", Kata.ageInDays(birthday.minusDays(2).getYear(), birthday.minusDays(2).getMonthValue(), birthday.minusDays(2).getDayOfMonth()));

    String expected = String.format("You are %d days old", Year.of(birthday.getYear()).length());
    assertEquals(expected, Kata.ageInDays(birthday.minusYears(1).getYear(), birthday.minusYears(1).getMonthValue(), birthday.minusYears(1).getDayOfMonth()));
  }
}
