import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TestClass {
  @Test
  void sample() {
    assertArrayEquals(new int[] {5, 10}, Kata.splitAndAdd(new int[] {1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new int[] {15}, Kata.splitAndAdd(new int[] {1, 2, 3, 4, 5}, 3));
    assertArrayEquals(new int[] {15}, Kata.splitAndAdd(new int[] {15}, 3));
    assertArrayEquals(new int[] {183, 125}, Kata.splitAndAdd(new int[] {32, 45, 43, 23, 54, 23, 54, 34}, 2));
    assertArrayEquals(new int[] {32, 45, 43, 23, 54, 23, 54, 34}, Kata.splitAndAdd(new int[] {32, 45, 43, 23, 54, 23, 54, 34}, 0));
    assertArrayEquals(new int[] {305, 1195}, Kata.splitAndAdd(new int[] {3, 234, 25, 345, 45, 34, 234, 235, 345}, 3));
    assertArrayEquals(new int[] {1040, 7712}, Kata.splitAndAdd(new int[] {3, 234, 25, 345, 45, 34, 234, 235, 345, 34, 534, 45, 645, 645, 645, 4656, 45, 3}, 4));
    assertArrayEquals(new int[] {79327}, Kata.splitAndAdd(new int[] {23, 345, 345, 345, 34536, 567, 568, 6, 34536, 54, 7546, 456}, 20));
  }
}
