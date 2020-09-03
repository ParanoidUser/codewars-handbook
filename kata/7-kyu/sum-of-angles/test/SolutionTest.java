import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(180, AngleSum.sumOfAngles(3));
    assertEquals(360, AngleSum.sumOfAngles(4));
  }
}
