import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(18, Solution.century(1705));
    assertEquals(19, Solution.century(1900));
    assertEquals(17, Solution.century(1601));
    assertEquals(20, Solution.century(2000));
    assertEquals(1, Solution.century(89));
  }
}