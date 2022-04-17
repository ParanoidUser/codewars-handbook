import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(9, Kata.sol(new int[]{0, 0, 0, 0, 2, 1, 0}, 2, 0, 1));
    assertEquals(20, Kata.sol(new int[]{0, 2, 0, 2, 0, 2, 0, 2}, 10, 0, 5));
    assertEquals(3, Kata.sol(new int[]{0, 1, 0, 0, 2, 1, 0, 2, 2, 1}, 3, -1, 2));
    assertEquals(70, Kata.sol(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 5, -1, 2));
    assertEquals(-60, Kata.sol(new int[]{0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 0, 2, 1, 2, 0, 2, 1}, 10, -5, 10));
    assertEquals(84, Kata.sol(new int[]{0, 1, 2, 0, 0, 2, 0, 1, 2, 1, 0, 0, 1, 0, 2, 1, 0, 2, 2, 0}, 9, 3, 2));
    assertEquals(90, Kata.sol(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 2, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 0}, 6, 0, 1));
  }
}