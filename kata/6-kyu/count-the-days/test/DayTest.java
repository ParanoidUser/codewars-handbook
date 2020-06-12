import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import org.junit.jupiter.api.Test;

class DayTest {
  @Test
  void sample() {
    var today = Calendar.getInstance();
    assertEquals("Today is the day!", Day.countDays(today.getTime()));

    var yesterday = Calendar.getInstance();
    yesterday.add(Calendar.DATE, -1);
    assertEquals("The day is in the past!", Day.countDays(yesterday.getTime()));

    var tomorrow = Calendar.getInstance();
    tomorrow.add(Calendar.DATE, 2);
    assertEquals("2 days", Day.countDays(tomorrow.getTime()));
  }
}
