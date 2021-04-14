import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void isArray() {
    assertEquals(int[].class, Kata.multiplyAll(new int[0]).apply(1).getClass());
  }

  @Test
  void hasCorrectLength() {
    assertEquals(2, Kata.multiplyAll(new int[2]).apply(1).length);
  }

  @Test
  void basicTests() {
    assertArrayEquals(new int[]{1, 2, 3}, Kata.multiplyAll(new int[]{1, 2, 3}).apply(1));
    assertArrayEquals(new int[]{2, 4, 6}, Kata.multiplyAll(new int[]{1, 2, 3}).apply(2));
    assertArrayEquals(new int[]{0, 0, 0}, Kata.multiplyAll(new int[]{1, 2, 3}).apply(0));
    assertArrayEquals(new int[0], Kata.multiplyAll(new int[0]).apply(10));
  }
}