import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("one o'clock", Solution.solve("13:00"));
    assertEquals("nine minutes past one", Solution.solve("13:09"));
    assertEquals("quarter past one", Solution.solve("13:15"));
    assertEquals("twenty nine minutes past one", Solution.solve("13:29"));
    assertEquals("half past one", Solution.solve("13:30"));
    assertEquals("twenty nine minutes to two", Solution.solve("13:31"));
    assertEquals("quarter to two", Solution.solve("13:45"));
    assertEquals("one minute to two", Solution.solve("13:59"));
    assertEquals("twelve minutes to one", Solution.solve("00:48"));
    assertEquals("eight minutes past midnight", Solution.solve("00:08"));
    assertEquals("twelve o'clock", Solution.solve("12:00"));
    assertEquals("midnight", Solution.solve("00:00"));
    assertEquals("one minute past seven", Solution.solve("19:01"));
    assertEquals("one minute past seven", Solution.solve("07:01"));
    assertEquals("one minute to two", Solution.solve("01:59"));
    assertEquals("one minute past twelve", Solution.solve("12:01"));
    assertEquals("one minute past midnight", Solution.solve("00:01"));
    assertEquals("twenty nine minutes to twelve", Solution.solve("11:31"));
    assertEquals("twenty nine minutes to midnight", Solution.solve("23:31"));
    assertEquals("one minute past midnight", Solution.solve("00:01"));
    assertEquals("quarter to twelve", Solution.solve("11:45"));
    assertEquals("one minute to twelve", Solution.solve("11:59"));
    assertEquals("quarter to midnight", Solution.solve("23:45"));
    assertEquals("one minute to midnight", Solution.solve("23:59"));
    assertEquals("quarter to two", Solution.solve("01:45"));
  }
}
