import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {0, 1}, Kata.testit(new int[] {0}, new int[] {1}));
    assertArrayEquals(new int[] {1, 2}, Kata.testit(new int[] {1, 1}, new int[] {2, 2}));
    assertArrayEquals(new int[] {1, 2}, Kata.testit(new int[] {1, 1, 1}, new int[] {2, 2, 2}));
    assertArrayEquals(new int[] {1, 1}, Kata.testit(new int[] {1, 1, 1, 1, 1}, new int[] {1, 1, 1, 1, 1, 1, 1}));
    assertArrayEquals(new int[] {1, 2, 3, 4}, Kata.testit(new int[] {1, 2}, new int[] {3, 4}));
    assertArrayEquals(new int[] {1, 2, 3, 4}, Kata.testit(new int[] {1}, new int[] {2, 3, 4}));
    assertArrayEquals(new int[] {1, 2, 3, 4}, Kata.testit(new int[] {1, 2, 3}, new int[] {4}));
    assertArrayEquals(new int[] {1, 1, 2, 2}, Kata.testit(new int[] {1, 2}, new int[] {1, 2}));
    assertArrayEquals(new int[] {1, 1, 2, 2}, Kata.testit(new int[] {1, 2, 1}, new int[] {2, 1, 2}));
  }
}
