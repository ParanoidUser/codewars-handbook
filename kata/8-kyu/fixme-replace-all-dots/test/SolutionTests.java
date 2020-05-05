import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTests {
  @Test
  void sample() {
    assertEquals("one-two-three", Dinglemouse.replaceDots("one.two.three"));
  }
}
