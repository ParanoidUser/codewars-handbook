import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Victory", Kata.codewarResult(new int[]{1, 2, 3}, new int[]{1, 2, 9}));
    assertEquals("Stalemate", Kata.codewarResult(new int[]{1, 2, 2}, new int[]{1, 2, 3}));
    assertEquals("Defeat", Kata.codewarResult(new int[]{1, 2, 2}, new int[]{1, 3, 3}));
    assertEquals("Victory", Kata.codewarResult(new int[]{2, 4, 3, 1}, new int[]{4, 5, 1, 2}));
    assertEquals("Defeat", Kata.codewarResult(new int[]{5}, new int[]{6}));
    assertEquals("Defeat", Kata.codewarResult(new int[]{1, 2, 2, 1}, new int[]{3, 1, 2, 3}));
    assertEquals("Defeat", Kata.codewarResult(new int[]{4, 5, 6, 2, 6}, new int[]{7, 7, 2, 14, 2}));
    assertEquals("Victory", Kata.codewarResult(new int[]{2, 11, 1, 7, 8}, new int[]{7, 6, 11, 5, 5}));
    assertEquals("Stalemate", Kata.codewarResult(new int[]{1, 4, 1}, new int[]{1, 5, 3}));
    assertEquals("Stalemate", Kata.codewarResult(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}));
    assertEquals("Stalemate", Kata.codewarResult(new int[]{2, 2, 3, 5, 2}, new int[]{3, 4, 8, 10, 1}));
    assertEquals("Stalemate", Kata.codewarResult(
        new int[]{2, 1, 3, 1, 1, 3, 3, 2, 3, 1, 1, 1, 3, 1, 3, 1, 3, 3, 1, 2, 3, 3, 1, 3},
        new int[]{4, 4, 1, 4, 3, 1, 4, 4, 3, 2, 1, 2, 1, 3, 3, 1, 4, 4, 3, 2, 3, 2, 4, 1}));
  }
}