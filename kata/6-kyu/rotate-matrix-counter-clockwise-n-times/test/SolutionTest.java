import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[][]{
            {2, 4},
            {1, 3}},
        Kata.rotateCounterclockwise(new int[][]{
            {1, 2},
            {3, 4}}, 1));

    assertArrayEquals(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}},
        Kata.rotateCounterclockwise(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}}, 4));

    assertArrayEquals(new int[][]{
            {4, 8, 12, 16},
            {3, 7, 11, 15},
            {2, 6, 10, 14},
            {1, 5, 9, 13}},
        Kata.rotateCounterclockwise(new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}}, 1));

    assertArrayEquals(new int[][]{
            {16, 15, 14, 13},
            {12, 11, 10, 9},
            {8, 7, 6, 5},
            {4, 3, 2, 1}},
        Kata.rotateCounterclockwise(new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}}, 2));

    assertArrayEquals(new int[][]{
            {57, 49, 41, 33, 25, 17, 9, 1},
            {58, 50, 42, 34, 26, 18, 10, 2},
            {59, 51, 43, 35, 27, 19, 11, 3},
            {60, 52, 44, 36, 28, 20, 12, 4},
            {61, 53, 45, 37, 29, 21, 13, 5},
            {62, 54, 46, 38, 30, 22, 14, 6},
            {63, 55, 47, 39, 31, 23, 15, 7},
            {64, 56, 48, 40, 32, 24, 16, 8}},
        Kata.rotateCounterclockwise(new int[][]{
            {1, 2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15, 16},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30, 31, 32},
            {33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48},
            {49, 50, 51, 52, 53, 54, 55, 56},
            {57, 58, 59, 60, 61, 62, 63, 64}}, 3));
  }
}