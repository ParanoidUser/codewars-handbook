import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("23:59", Solution.solve(new String[]{"14:51"}));
    assertEquals("11:40", Solution.solve(new String[]{"23:00", "04:22", "18:05", "06:24"}));
    assertEquals("09:10", Solution.solve(new String[]{"21:14", "15:34", "14:51", "06:25", "15:30"}));
  }
}