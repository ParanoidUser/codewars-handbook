import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PointsInSegmentsTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 3, 4}, PointsInSegments.segments(5, new int[][] {{2, 2}, {1, 2}, {5, 5}}));
    assertArrayEquals(new int[0], PointsInSegments.segments(7, new int[][] {{0,7}}));
  }
}