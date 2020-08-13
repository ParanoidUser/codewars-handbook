import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ValleyTest {
  @Test
  void sample() {
    assertArrayEquals(new int[0], Valley.makeValley(new int[0]));
    assertArrayEquals(new int[] {19, 6, 8}, Valley.makeValley(new int[] {19, 8, 6}));
    assertArrayEquals(new int[] {14, 8, 10}, Valley.makeValley(new int[] {14, 10, 8}));
    assertArrayEquals(new int[] {20, 6, 2, 7}, Valley.makeValley(new int[] {20, 7, 6, 2}));
    assertArrayEquals(new int[] {20, 14, 1, 10, 16}, Valley.makeValley(new int[] {20, 16, 14, 10, 1}));
    assertArrayEquals(new int[] {19, 18, 12, 9, 4, 7, 11, 14, 19}, Valley.makeValley(new int[] {19, 19, 18, 14, 12, 11, 9, 7, 4}));
    assertArrayEquals(new int[] {17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17}, Valley.makeValley(new int[] {17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1}));
    assertArrayEquals(new int[] {20, 16, 12, 11, 3, 2, 10, 12, 14, 20}, Valley.makeValley(new int[] {20, 20, 16, 14, 12, 12, 11, 10, 3, 2}));
    assertArrayEquals(new int[] {19, 16, 13, 5, 4, 4, 4, 5, 8, 15, 17}, Valley.makeValley(new int[] {19, 17, 16, 15, 13, 8, 5, 5, 4, 4, 4}));
    assertArrayEquals(new int[] {20, 17, 12, 10, 4, 2, 1, 1, 2, 9, 12, 13, 18}, Valley.makeValley(new int[] {20, 18, 17, 13, 12, 12, 10, 9, 4, 2, 2, 1, 1}));
    assertArrayEquals(new int[] {20, 16, 14, 13, 10, 4, 4, 1, 4, 9, 13, 14, 15, 18}, Valley.makeValley(new int[] {20, 18, 16, 15, 14, 14, 13, 13, 10, 9, 4, 4, 4, 1}));
  }
}
