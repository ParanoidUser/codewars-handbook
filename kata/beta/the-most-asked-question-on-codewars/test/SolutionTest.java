import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Codewars.detect("Can someone explain to me what this kata is about?"));
    assertFalse(Codewars.detect("Can someone solve this kata for me?"));
    assertFalse(Codewars.detect("can someone explain to me how to enable caps lock/"));
  }
}