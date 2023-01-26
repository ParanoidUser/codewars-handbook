import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{2, 5}}, Kata.FibDigits(10));
    assertArrayEquals(new int[][]{
        {254, 3},
        {228, 2},
        {217, 6},
        {217, 0},
        {202, 5},
        {199, 1},
        {198, 7},
        {197, 8},
        {194, 4},
        {184, 9}
    }, Kata.FibDigits(10000));
    assertArrayEquals(new int[][]{
        {1408, 2},
        {1377, 7},
        {1373, 0},
        {1369, 5},
        {1359, 8},
        {1339, 9},
        {1339, 3},
        {1316, 6},
        {1309, 1},
        {1300, 4},
    }, Kata.FibDigits(64544));
    assertArrayEquals(new int[][]{
        {2149, 2},
        {2135, 1},
        {2131, 8},
        {2118, 9},
        {2109, 0},
        {2096, 3},
        {2053, 5},
        {2051, 6},
        {2034, 7},
        {2023, 4},
    }, Kata.FibDigits(100000));
  }
}