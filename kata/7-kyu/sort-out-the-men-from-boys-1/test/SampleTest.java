import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void checkPositiveValues() {
    doTest(new int[] {7, 3, 14, 17}, new int[] {14, 17, 7, 3});
    doTest(new int[] {2, 43, 95, 90, 37}, new int[] {2, 90, 95, 43, 37});
    doTest(new int[] {20, 33, 50, 34, 43, 46}, new int[] {20, 34, 46, 50, 43, 33});
    doTest(new int[] {82, 91, 72, 76, 76, 100, 85}, new int[] {72, 76, 82, 100, 91, 85});
    doTest(new int[] {2, 15, 17, 15, 2, 10, 10, 17, 1, 1}, new int[] {2, 10, 17, 15, 1});
  }

  @Test
  public void checkNegativeValues() {
    doTest(new int[] {-32, -39, -35, -41}, new int[] {-32, -35, -39, -41});
    doTest(new int[] {-64, -71, -63, -66, -65}, new int[] {-66, -64, -63, -65, -71});
    doTest(new int[] {-94, -99, -100, -99, -96, -99}, new int[] {-100, -96, -94, -99});
    doTest(new int[] {-53, -26, -53, -27, -49, -51, -14}, new int[] {-26, -14, -27, -49, -51, -53});
    doTest(new int[] {-17, -45, -15, -33, -85, -56, -86, -30}, new int[] {-86, -56, -30, -15, -17, -33, -45, -85});
  }

  @Test
  public void checkMixedValues() {
    doTest(new int[] {12, 89, -38, -78}, new int[] {-78, -38, 12, 89});
    doTest(new int[] {2, -43, 95, -90, 37}, new int[] {-90, 2, 95, 37, -43});
    doTest(new int[] {82, -61, -87, -12, 21, 1}, new int[] {-12, 82, 21, 1, -61, -87});
    doTest(new int[] {63, -57, 76, -85, 88, 2, -28}, new int[] {-28, 2, 76, 88, 63, -57, -85});
    doTest(new int[] {49, 818, -282, 900, 928, 281, -282, -1}, new int[] {-282, 818, 900, 928, 281, 49, -1});
  }

  void doTest(int[] values, int[] expected) {
    assertArrayEquals(expected, Kata.menFromBoys(values));
  }
}
