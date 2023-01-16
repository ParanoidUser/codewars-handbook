import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Disarium !!", Solution.disariumNumber(89));
    assertEquals("Not !!", Solution.disariumNumber(564));
    assertEquals("Not !!", Solution.disariumNumber(1024));
    assertEquals("Not !!", Solution.disariumNumber(64599));
    assertEquals("Not !!", Solution.disariumNumber(136586));
    assertEquals("Not !!", Solution.disariumNumber(1048576));
  }
}