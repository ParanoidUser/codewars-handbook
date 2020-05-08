import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Goals.goals(0, 0, 0));
    assertEquals(58, Goals.goals(43, 10, 5));
  }
}
