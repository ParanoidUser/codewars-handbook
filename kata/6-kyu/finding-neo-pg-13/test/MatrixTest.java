import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixTest {
  @Test
  void sample() {
    var x = new Morpheus();

    var m0 = new ArrayMatrix(new int[0][]);
    assertArrayEquals(new int[0], x.find(m0, 1));

    var m1 = new ArrayMatrix(new int[][]{{1}});
    assertArrayEquals(new int[]{0, 0}, x.find(m1, 1));

    var m2 = new ArrayMatrix(new int[][]{{1, 2}, {3, 4}});
    assertArrayEquals(new int[]{0, 0}, x.find(m2, 1));

    var m3 = new ArrayMatrix(new int[][]{{1, 2}, {3, 4}});
    assertArrayEquals(new int[]{0, 1}, x.find(m3, 2));

    var m4 = new ArrayMatrix(new int[][]{{1, 2}, {3, 4}});
    assertArrayEquals(new int[]{1, 0}, x.find(m4, 3));

    var m5 = new ArrayMatrix(new int[][]{{1, 2}, {3, 4}});
    assertArrayEquals(new int[]{1, 1}, x.find(m5, 4));

    var m6 = new ArrayMatrix(new int[][]{
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
        {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
        {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
        {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
        {50, 51, 52, 53, 54, 55, 56, 57, 58, 59},
        {60, 61, 62, 63, 64, 65, 66, 67, 68, 69},
        {70, 71, 72, 73, 74, 75, 76, 77, 78, 79},
        {80, 81, 82, 83, 84, 85, 86, 87, 88, 89},
        {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}
    });
    assertArrayEquals(new int[]{4, 2}, x.find(m6, 42));
  }
}

