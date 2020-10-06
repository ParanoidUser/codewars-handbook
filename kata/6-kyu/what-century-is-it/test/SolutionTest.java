import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("10th", Solution.whatCentury(1000));
    assertEquals("11th", Solution.whatCentury(1001));
    assertEquals("12th", Solution.whatCentury(1111));
    assertEquals("13th", Solution.whatCentury(1234));
    assertEquals("14th", Solution.whatCentury(1357));
    assertEquals("20th", Solution.whatCentury(1999));
    assertEquals("21st", Solution.whatCentury(2011));
    assertEquals("22nd", Solution.whatCentury(2154));
    assertEquals("23rd", Solution.whatCentury(2259));
  }
}