import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"0", "0"}, Kata.oneTwoThree(0));
    assertArrayEquals(new String[]{"1", "1"}, Kata.oneTwoThree(1));
    assertArrayEquals(new String[]{"2", "11"}, Kata.oneTwoThree(2));
    assertArrayEquals(new String[]{"3", "111"}, Kata.oneTwoThree(3));
    assertArrayEquals(new String[]{"991", "1111111111111111111"}, Kata.oneTwoThree(19));
    assertArrayEquals(new String[]{"9".repeat(26), "1".repeat(234)}, Kata.oneTwoThree(234));
  }
}