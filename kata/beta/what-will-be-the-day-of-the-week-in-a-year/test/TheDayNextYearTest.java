import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TheDayNextYearTest {
  @Test
  void sample() {
    assertEquals("Wednesday", TheDayNextYear.getDayOfWeek(2017, 10, 10));
    assertEquals("Thursday", TheDayNextYear.getDayOfWeek(2017, 10, 11));
    assertEquals("Friday", TheDayNextYear.getDayOfWeek(2017, 10, 12));
    assertEquals("Saturday", TheDayNextYear.getDayOfWeek(2017, 10, 13));
  }
}