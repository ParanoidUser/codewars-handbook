import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, new FindDivisor().numberOfDivisors(4));
    assertEquals(2, new FindDivisor().numberOfDivisors(5));
    assertEquals(6, new FindDivisor().numberOfDivisors(12));
    assertEquals(8, new FindDivisor().numberOfDivisors(30));
  }
}
