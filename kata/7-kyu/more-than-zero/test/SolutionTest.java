import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("8 is more than zero.", MoreThanZero.corrections(8));
    assertEquals("1 is more than zero.", MoreThanZero.corrections(1));
    assertEquals("-2 is equal to or less than zero.", MoreThanZero.corrections(-2));
    assertEquals("-1 is equal to or less than zero.", MoreThanZero.corrections(-1));
    assertEquals("0 is equal to or less than zero.", MoreThanZero.corrections(0));
  }
}