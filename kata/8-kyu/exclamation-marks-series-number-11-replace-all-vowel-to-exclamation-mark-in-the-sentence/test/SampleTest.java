import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("H!!", Solution.replace("Hi!"));
    assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
    assertEquals("!!!!!", Solution.replace("aeiou"));
    assertEquals("!BCD!", Solution.replace("ABCDE"));
  }
}
