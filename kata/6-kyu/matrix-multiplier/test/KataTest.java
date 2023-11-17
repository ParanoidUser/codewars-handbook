import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new double[][]{{6}},
        Kata.getMatrixProduct(
            new double[][]{{2}},
            new double[][]{{3}}));

    assertArrayEquals(new double[][]{{19, 22}, {43, 50}},
        Kata.getMatrixProduct(
            new double[][]{{1, 2}, {3, 4}},
            new double[][]{{5, 6}, {7, 8}}));

    assertArrayEquals(new double[][]{{0.7, 1.0}, {1.5, 2.2}},
        Kata.getMatrixProduct(
            new double[][]{{0.5, 1}, {1.5, 2}},
            new double[][]{{0.2, 0.4}, {0.6, 0.8}}));

    assertArrayEquals(new double[][]{{73, 31, 78}, {54, 13, 43}, {106, 32, 94}, {63, 36, 81}},
        Kata.getMatrixProduct(
            new double[][]{{7, 3}, {2, 5}, {6, 8}, {9, 0}},
            new double[][]{{7, 4, 9}, {8, 1, 5}}));

    assertNull(Kata.getMatrixProduct(new double[][]{{1, 2}, {3, 4}}, new double[][]{{2, 4}}));
  }
}