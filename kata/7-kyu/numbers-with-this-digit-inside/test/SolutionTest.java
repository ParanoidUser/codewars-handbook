import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{0, 0, 0}, Kata.NumbersWithDigitInside(5, 6));
    assertArrayEquals(new long[]{1, 6, 6}, Kata.NumbersWithDigitInside(7, 6));
    assertArrayEquals(new long[]{3, 22, 110}, Kata.NumbersWithDigitInside(11, 1));
    assertArrayEquals(new long[]{2, 30, 200}, Kata.NumbersWithDigitInside(20, 0));
    assertArrayEquals(new long[]{9, 286, 5955146588160L}, Kata.NumbersWithDigitInside(44, 4));
  }
}
