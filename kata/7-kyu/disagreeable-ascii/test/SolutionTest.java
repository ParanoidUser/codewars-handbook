import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(254, Ascii.getWeight("Joe"));
    assertEquals(205, Ascii.getWeight("CJ"));
    assertEquals(141, Ascii.getWeight("cj"));
    assertEquals(0, Ascii.getWeight("@[{`"));
  }
}
