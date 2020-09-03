import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SwapTest {
  @Test
  void sample() {
    assertArrayEquals(new Integer[][][]{{{0, 0}, {1, 1}}, {{0, 0}, {1, 1}}}, new Swappairs().swapp(new Integer[][]{{0, 0}, {1, 1}}));
    assertArrayEquals(new Integer[][][]{{{1, 0}, {0, 1}}, {{0, 1}, {1, 0}}}, new Swappairs().swapp(new Integer[][]{{1, 0}, {0, 1}}));
    assertArrayEquals(new String[][][] {{{"aa", "bb"}, {"abc", "def"}}, {{"bb", "aa"}, {"def", "abc"}}}, new Swappairs().swapp(new String[][]{{"aa", "bb"}, {"abc", "def"}}));
  }
}
