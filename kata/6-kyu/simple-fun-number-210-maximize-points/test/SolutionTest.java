import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Tennis.maximizePoints(new int[]{99}, new int[]{1}));
    assertEquals(0, Tennis.maximizePoints(new int[]{1}, new int[]{99}));
    assertEquals(3, Tennis.maximizePoints(new int[]{3, 2, 4}, new int[]{1, 2, 3}));
    assertEquals(3, Tennis.maximizePoints(new int[]{25, 7, 26, 48}, new int[]{1, 36, 5, 33}));
    assertEquals(7, Tennis.maximizePoints(new int[]{7, 19, 23, 18, 38, 37, 38, 40}, new int[]{21, 12, 1, 0, 13, 38, 25, 49}));
    assertEquals(91, Tennis.maximizePoints(
        new int[] {61, 42, 29, 22, 81, 82, 43, 67, 91, 88, 84, 12, 47, 79, 38, 38, 98, 15, 26, 55, 11, 6, 68, 30, 87, 18, 61, 81, 16, 57, 17, 95, 91, 87, 79, 30, 22, 43, 34, 18, 15, 62, 50, 61, 26, 54, 52, 66, 43, 72, 78, 24, 10, 64, 12, 60, 84, 15, 55, 73, 4, 90, 65, 42, 71, 9, 77, 9, 91, 71, 36, 24, 93, 61, 18, 34, 72, 49, 50, 53, 37, 60, 28, 24, 79, 94, 89, 93, 67, 41, 53, 19, 40, 83, 64, 97},
        new int[] {62, 86, 82, 84, 27, 23, 74, 54, 55, 58, 91, 5, 87, 82, 44, 72, 21, 68, 11, 14, 58, 69, 35, 49, 46, 57, 73, 3, 67, 27, 58, 71, 64, 2, 81, 24, 45, 60, 50, 86, 47, 48, 96, 11, 62, 41, 57, 20, 91, 83, 19, 47, 55, 60, 16, 70, 12, 25, 33, 56, 20, 98, 20, 47, 52, 28, 18, 51, 72, 91, 95, 32, 40, 35, 33, 26, 55, 31, 51, 14, 24, 61, 14, 17, 67, 83, 61, 38, 66, 83, 40, 60, 95, 47, 22, 82}
    ));
  }
}