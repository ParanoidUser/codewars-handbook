import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DateDaysTest {
  @Test
  void sample() {
    assertEquals("2024-07-03", DateDays.dateNbDays(4281, 5087, 2));
    assertEquals("2021-09-19", DateDays.dateNbDays(4620, 5188, 2));
    assertEquals("2018-03-13", DateDays.dateNbDays(9999, 11427, 6));
    assertEquals("2026-04-18", DateDays.dateNbDays(3525, 4822, 3));
    assertEquals("2017-06-10", DateDays.dateNbDays(5923, 6465, 6));
    assertEquals("2017-05-22", DateDays.dateNbDays(4254, 4761, 8));
    assertEquals("2033-11-04", DateDays.dateNbDays(1244, 2566, 4));
    assertEquals("2019-05-25", DateDays.dateNbDays(6328, 7517, 5));
    assertEquals("2029-06-03", DateDays.dateNbDays(2920, 3834, 2));
    assertEquals("2019-07-09", DateDays.dateNbDays(7792, 8987, 4));
  }
}
