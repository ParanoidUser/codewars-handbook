import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[0], Kata.getW(-5));
    assertArrayEquals(new String[0], Kata.getW(1));
    assertArrayEquals(new String[]{
        "*   *   *",
        " * * * * ",
        "  *   *  "
    }, Kata.getW(3));
    assertArrayEquals(new String[]{
        "*           *           *",
        " *         * *         * ",
        "  *       *   *       *  ",
        "   *     *     *     *   ",
        "    *   *       *   *    ",
        "     * *         * *     ",
        "      *           *      "
    }, Kata.getW(7));
  }
}
