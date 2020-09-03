import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6, MaxMultiple.maxMultiple(2, 7));
    assertEquals(9, MaxMultiple.maxMultiple(3, 10));
    assertEquals(14, MaxMultiple.maxMultiple(7, 17));
    assertEquals(50, MaxMultiple.maxMultiple(10, 50));
    assertEquals(185, MaxMultiple.maxMultiple(37, 200));
    assertEquals(98, MaxMultiple.maxMultiple(7, 100));
  }
}
