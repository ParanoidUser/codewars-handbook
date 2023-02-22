import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    }, SpiralingBox.createBox(4, 2));

    assertArrayEquals(new int[][]{
        {1, 1},
        {1, 1},
        {1, 1},
        {1, 1}
    }, SpiralingBox.createBox(2, 4));

    assertArrayEquals(new int[][]{
        {1, 1, 1, 1, 1, 1, 1},
        {1, 2, 2, 2, 2, 2, 1},
        {1, 2, 3, 3, 3, 2, 1},
        {1, 2, 3, 4, 3, 2, 1},
        {1, 2, 3, 4, 3, 2, 1},
        {1, 2, 3, 3, 3, 2, 1},
        {1, 2, 2, 2, 2, 2, 1},
        {1, 1, 1, 1, 1, 1, 1}
    }, SpiralingBox.createBox(7, 8));

    assertArrayEquals(new int[][]{
        {1, 1, 1, 1, 1, 1, 1, 1},
        {1, 2, 2, 2, 2, 2, 2, 1},
        {1, 2, 3, 3, 3, 3, 2, 1},
        {1, 2, 3, 4, 4, 3, 2, 1},
        {1, 2, 3, 3, 3, 3, 2, 1},
        {1, 2, 2, 2, 2, 2, 2, 1},
        {1, 1, 1, 1, 1, 1, 1, 1}
    }, SpiralingBox.createBox(8, 7));
  }
}