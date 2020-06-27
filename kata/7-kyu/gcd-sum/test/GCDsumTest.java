import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class GCDsumTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{3, 3}, GCDsum.solve(6, 3));
    assertArrayEquals(new int[]{2, 6}, GCDsum.solve(8, 2));
    assertArrayEquals(new int[]{-1, -1}, GCDsum.solve(10, 3));
    assertArrayEquals(new int[]{4, 8}, GCDsum.solve(12, 4));
    assertArrayEquals(new int[]{-1, -1}, GCDsum.solve(12, 5));
    assertArrayEquals(new int[]{10, 40}, GCDsum.solve(50, 10));
    assertArrayEquals(new int[]{-1, -1}, GCDsum.solve(50, 4));
    assertArrayEquals(new int[]{5, 5}, GCDsum.solve(10, 5));
    assertArrayEquals(new int[]{5, 95}, GCDsum.solve(100, 5));
    assertArrayEquals(new int[]{5, 995}, GCDsum.solve(1000, 5));
  }
}