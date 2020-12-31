import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeFormatterTest {
  @Test
  void sample() {
    assertEquals("twenty-eight minutes past five", TimeFormatter.toHumanTime("05:28 pm"));
    assertEquals("twelve o'clock", TimeFormatter.toHumanTime("12:00"));
    assertEquals("quarter to four", TimeFormatter.toHumanTime("03:45am"));
    assertEquals("quarter past seven", TimeFormatter.toHumanTime("07:15"));
    assertEquals("half past eleven", TimeFormatter.toHumanTime("23:30"));
    assertEquals("one minute past twelve", TimeFormatter.toHumanTime("00:01"));
    assertEquals("nine minutes to six", TimeFormatter.toHumanTime("17:51"));
    assertEquals("quarter to one", TimeFormatter.toHumanTime("00:45"));
  }
}