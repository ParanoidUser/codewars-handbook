import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Shifter.count("ON"));
    assertEquals(2, Shifter.count("OS IS UPDATED"));
    assertEquals(2, Shifter.count("WHO IS WHO"));
    assertEquals(0, Shifter.count("js"));
    assertEquals(2, Shifter.count("I III I III"));
    assertEquals(0, Shifter.count(""));
  }
}