import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, CoinFree.solve(75, new int[]{1, 5, 10, 25}));
    assertEquals(9, CoinFree.solve(123, new int[]{1, 5, 10, 25}));
    assertEquals(3, CoinFree.solve(75, new int[]{1, 2, 5, 10, 20, 50}));
    assertEquals(5, CoinFree.solve(123, new int[]{1, 2, 5, 10, 20, 50}));
    assertEquals(48, CoinFree.solve(1232, new int[]{27, 3, 1, 7}));
  }
}