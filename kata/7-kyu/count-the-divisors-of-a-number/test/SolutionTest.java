import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, FindDivisor.numberOfDivisors(4));
    assertEquals(2, FindDivisor.numberOfDivisors(5));
    assertEquals(6, FindDivisor.numberOfDivisors(12));
    assertEquals(8, FindDivisor.numberOfDivisors(30));
  }
}
