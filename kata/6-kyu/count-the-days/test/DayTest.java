import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;

class DayTest {
  @Test
  void sample() {
    var utc = TimeZone.getTimeZone("UTC");
    var today = Calendar.getInstance(utc);
    assertEquals("Today is the day!", new Day().countDays(today.getTime()));

    var yesterday = Calendar.getInstance(utc);
    yesterday.add(Calendar.DATE, -1);
    assertEquals("The day is in the past!", new Day().countDays(yesterday.getTime()));

    var tomorrow = Calendar.getInstance(utc);
    tomorrow.add(Calendar.DATE, 2);
    assertEquals("2 days", new Day().countDays(tomorrow.getTime()));
  }
}
