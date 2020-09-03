import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertArrayEquals(new int[] {14, 17, 7, 3}, Kata.menFromBoys(new int[] {7, 3, 14, 17}));
    assertArrayEquals(new int[] {-78, -38, 12, 89}, Kata.menFromBoys(new int[] {12, 89, -38, -78}));
    assertArrayEquals(new int[] {2, 10, 17, 15, 1}, Kata.menFromBoys(new int[] {2, 15, 17, 15, 2, 10, 10, 17, 1, 1}));
    assertArrayEquals(new int[] {2, 90, 95, 43, 37}, Kata.menFromBoys(new int[] {2, 43, 95, 90, 37}));
    assertArrayEquals(new int[] {-32, -35, -39, -41}, Kata.menFromBoys(new int[] {-32, -39, -35, -41}));
    assertArrayEquals(new int[] {-100, -96, -94, -99}, Kata.menFromBoys(new int[] {-94, -99, -100, -99, -96, -99}));
    assertArrayEquals(new int[] {-90, 2, 95, 37, -43}, Kata.menFromBoys(new int[] {2, -43, 95, -90, 37}));
    assertArrayEquals(new int[] {20, 34, 46, 50, 43, 33}, Kata.menFromBoys(new int[] {20, 33, 50, 34, 43, 46}));
    assertArrayEquals(new int[] {72, 76, 82, 100, 91, 85}, Kata.menFromBoys(new int[] {82, 91, 72, 76, 76, 100, 85}));
    assertArrayEquals(new int[] {-66, -64, -63, -65, -71}, Kata.menFromBoys(new int[] {-64, -71, -63, -66, -65}));
    assertArrayEquals(new int[] {-12, 82, 21, 1, -61, -87}, Kata.menFromBoys(new int[] {82, -61, -87, -12, 21, 1}));
    assertArrayEquals(new int[] {-26, -14, -27, -49, -51, -53}, Kata.menFromBoys(new int[] {-53, -26, -53, -27, -49, -51, -14}));
    assertArrayEquals(new int[] {-28, 2, 76, 88, 63, -57, -85}, Kata.menFromBoys(new int[] {63, -57, 76, -85, 88, 2, -28}));
    assertArrayEquals(new int[] {-282, 818, 900, 928, 281, 49, -1}, Kata.menFromBoys(new int[] {49, 818, -282, 900, 928, 281, -282, -1}));
    assertArrayEquals(new int[] {-86, -56, -30, -15, -17, -33, -45, -85}, Kata.menFromBoys(new int[] {-17, -45, -15, -33, -85, -56, -86, -30}));
  }
}
