import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MatrixAdditionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{{3}}, Kata.matrixAddition(
        new int[][]{{1}},
        new int[][]{{2}}
    ));

    assertArrayEquals(new int[][]{{3, 5}, {3, 5}}, Kata.matrixAddition(
        new int[][]{{1, 2}, {1, 2}},
        new int[][]{{2, 3}, {2, 3}}
    ));

    assertArrayEquals(new int[][]{{3, 4, 4}, {6, 4, 4}, {2, 2, 4}}, Kata.matrixAddition(
        new int[][]{{1, 2, 3}, {3, 2, 1}, {1, 1, 1}},
        new int[][]{{2, 2, 1}, {3, 2, 3}, {1, 1, 3}}
    ));
  }
}
