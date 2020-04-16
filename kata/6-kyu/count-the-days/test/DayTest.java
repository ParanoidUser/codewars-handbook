import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DayTest {
  @Test
  public void standardTests() {
    var past = Calendar.getInstance();
    past.set(2000, Calendar.DECEMBER, 24);
    assertEquals("The day is in the past!",  Day.countDays(past.getTime()));
    assertEquals("Today is the day!", Day.countDays(new Date()));
  }
}
