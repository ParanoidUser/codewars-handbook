import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, CC.charCount("fizzbuzz", 'z'));
    assertEquals(4, CC.charCount("FIZZBUZZ", 'z'));
  }
}
