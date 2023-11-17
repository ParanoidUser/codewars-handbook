import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1x1() {
    assertArrayEquals(new double[][]{{6}},
        Kata.getMatrixProduct(
            new double[][]{{2}},
            new double[][]{{3}}));
  }

  @Test
  public void test2x2() {
    assertArrayEquals(new double[][]{{19, 22}, {43, 50}},
        Kata.getMatrixProduct(
            new double[][]{{1, 2}, {3, 4}},
            new double[][]{{5, 6}, {7, 8}}));
  }

  @Test
  public void testDecimals() {
    assertArrayEquals(new double[][]{{0.7, 1.0}, {1.5, 2.2}},
        Kata.getMatrixProduct(
            new double[][]{{0.5, 1}, {1.5, 2}},
            new double[][]{{0.2, 0.4}, {0.6, 0.8}}));
  }

  @Test
  public void testAsymmetric() {
    assertArrayEquals(
        new double[][]{{73, 31, 78}, {54, 13, 43}, {106, 32, 94}, {63, 36, 81}},
        Kata.getMatrixProduct(
            new double[][]{{7, 3}, {2, 5}, {6, 8}, {9, 0}},
            new double[][]{{7, 4, 9}, {8, 1, 5}}));
  }

  @Test
  public void testInvalid() {
    assertArrayEquals(null,
        Kata.getMatrixProduct(new double[][]{{1, 2}, {3, 4}}, new double[][]{{2, 4}}));
  }
}