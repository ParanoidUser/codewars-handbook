import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(6, Summation.summy("1 2 3"));
    assertEquals(10, Summation.summy("1 2 3 4"));
    assertEquals(15, Summation.summy("1 2 3 4 5"));
    assertEquals(20, Summation.summy("10 10"));
    assertEquals(0, Summation.summy("0 0"));
  }
}
