import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{
            {1, 1, -5, 5},
            {2, 0, 11, 2},
            {3, 1, 0, 4},
            {2, -6, 8, 1}},
        CodeWars.matrix(new int[][]{
            {1, 1, -5, 5},
            {2, -4, 11, 2},
            {3, 1, -1, 4},
            {2, -6, 8, 10}}));

    assertArrayEquals(new int[][]{
            {0, 4, -5, -9, 3},
            {6, 0, -7, 4, -5},
            {3, 5, 1, -9, -1},
            {1, 5, -7, 0, -9},
            {-3, 2, 1, -5, 1}},
        CodeWars.matrix(new int[][]{
            {-1, 4, -5, -9, 3},
            {6, -4, -7, 4, -5},
            {3, 5, 4, -9, -1},
            {1, 5, -7, -8, -9},
            {-3, 2, 1, -5, 6}}));

    assertArrayEquals(new int[][]{
            {0, 4, -5, -9, 3},
            {6, 1, -7, 4, -5},
            {3, 5, 1, -9, -1},
            {1, 5, -7, 1, -9},
            {-3, 2, 1, -5, 0}},
        CodeWars.matrix(new int[][]{
            {-1, 4, -5, -9, 3},
            {6, 8, -7, 4, -5},
            {3, 5, 1, -9, -1},
            {1, 5, -7, 15, -9},
            {-3, 2, 1, -5, -6}}));

    assertArrayEquals(new int[][]{
            {0, 4, -5, -9, 3, 8},
            {6, 1, -7, 4, -5, -1},
            {3, 5, 1, -9, -1, 6},
            {1, 5, -7, 1, -9, 3},
            {-3, 2, 1, -5, 0, 0},
            {8, 2, 0, -2, 4, 0}},
        CodeWars.matrix(new int[][]{
            {-1, 4, -5, -9, 3, 8},
            {6, 8, -7, 4, -5, -1},
            {3, 5, 1, -9, -1, 6},
            {1, 5, -7, 15, -9, 3},
            {-3, 2, 1, -5, -6, 0},
            {8, 2, 0, -2, 4, -5}}));
  }
}