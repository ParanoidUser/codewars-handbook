import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(PeriodTime.periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28));
    assertFalse(PeriodTime.periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));
  }
}