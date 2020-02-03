import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertArrayEquals(new String[0], Kata.getW(-5));
    assertArrayEquals(new String[0], Kata.getW(1));
    assertArrayEquals(new String[] {
            "*   *   *",
            " * * * * ",
            "  *   *  "
    }, Kata.getW(3));
    assertArrayEquals(new String[] {
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
