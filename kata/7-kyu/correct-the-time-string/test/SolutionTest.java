import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("12:10:10", Solution.timeCorrect("11:70:10"));
    assertEquals("12:00:00", Solution.timeCorrect("12:00:00"));
    assertEquals("20:39:09", Solution.timeCorrect("19:99:09"));
    assertEquals("20:40:39", Solution.timeCorrect("19:99:99"));
    assertEquals("00:00:00", Solution.timeCorrect("23:59:60"));
    assertEquals("00:00:00", Solution.timeCorrect("24:00:00"));
    assertEquals("00:01:01", Solution.timeCorrect("24:01:01"));
    assertEquals("01:00:00", Solution.timeCorrect("24:60:00"));
    assertEquals("01:00:00", Solution.timeCorrect("25:00:00"));
    assertEquals("00:00:00", Solution.timeCorrect("47:59:60"));
    assertEquals("00:00:59", Solution.timeCorrect("47:60:59"));
    assertEquals("04:01:01", Solution.timeCorrect("52:01:01"));
    assertEquals("04:40:39", Solution.timeCorrect("99:99:99"));
    assertNull(Solution.timeCorrect(null));
    assertNull(Solution.timeCorrect("0:00:00"));
    assertNull(Solution.timeCorrect("00:0:00"));
    assertNull(Solution.timeCorrect("00:00:0"));
    assertNull(Solution.timeCorrect("-0:00:00"));
    assertNull(Solution.timeCorrect("00:00:000"));
    assertNull(Solution.timeCorrect("000000"));
    assertNull(Solution.timeCorrect("00;11;22"));
    assertNull(Solution.timeCorrect("00:00:0/"));
    assertNull(Solution.timeCorrect(":0:00:00"));
  }
}
