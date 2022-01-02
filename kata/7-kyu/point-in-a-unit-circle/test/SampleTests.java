import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertTrue(Kata.pointInCircle(0, 0));
    assertFalse(Kata.pointInCircle(2, 0));
    assertTrue(Kata.pointInCircle(0, .9));
    assertTrue(Kata.pointInCircle(.5, .5));
    assertFalse(Kata.pointInCircle(1, 0));
  }
}
