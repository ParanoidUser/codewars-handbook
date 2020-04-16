import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void testSortItOut_1() {
    assertArrayEquals(new Double[] {11d, 33d, 55d, 55d, 90.4, 78d, 44d, 22d, 4d}, Kata.sortItOut(new Double[] {11d, 22d, 33d, 44d, 55d, 55d, 90.4, 4d, 78d}));
  }

  @Test
  public void testSortItOut_2() {
    assertArrayEquals(new Double[] {1d, 11d, 243d, 432414d, 52d, 46d, 32d, 26d, 2d}, Kata.sortItOut(new Double[] {26d, 243d, 52d, 2d, 432414d, 1d, 11d, 46d, 32d}));
  }

  @Test
  public void testSortItOut_3() {
    assertArrayEquals(new Double[] {19d, 33d, 49d, 65d, 112d, 88d, 88d, 60d, 14d}, Kata.sortItOut(new Double[] {19d, 65d, 88d, 112d, 60d, 14d, 33d, 49d, 88d}));
  }

  @Test
  public void testSortItOut_4() {
    assertArrayEquals(new Double[0], Kata.sortItOut(new Double[0]));
  }

  @Test
  public void testSortItOut_5() {
    assertArrayEquals(new Double[] {5d, 25d, 67d, 67d, 99d, 68d, 50d, 34d, 10d, 8d, 2d}, Kata.sortItOut(new Double[] {68d, 25d, 99d, 50d, 10d, 67d, 2d, 5d, 8d, 34d, 67d}));
  }
}
