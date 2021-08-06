import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{1}, Solution.peelTheOnion(1, 1));
    assertArrayEquals(new int[]{2}, Solution.peelTheOnion(2, 1));
    assertArrayEquals(new int[]{2, 1}, Solution.peelTheOnion(3, 1));
    assertArrayEquals(new int[]{2, 2}, Solution.peelTheOnion(4, 1));
    assertArrayEquals(new int[]{2, 2, 1}, Solution.peelTheOnion(5, 1));
    assertArrayEquals(new int[]{2, 2, 2}, Solution.peelTheOnion(6, 1));

    assertArrayEquals(new int[]{1}, Solution.peelTheOnion(1, 2));
    assertArrayEquals(new int[]{4}, Solution.peelTheOnion(2, 2));
    assertArrayEquals(new int[]{8, 1}, Solution.peelTheOnion(3, 2));
    assertArrayEquals(new int[]{12, 4}, Solution.peelTheOnion(4, 2));
    assertArrayEquals(new int[]{16, 8, 1}, Solution.peelTheOnion(5, 2));

    assertArrayEquals(new int[]{1}, Solution.peelTheOnion(1, 3));
    assertArrayEquals(new int[]{8}, Solution.peelTheOnion(2, 3));
    assertArrayEquals(new int[]{26, 1}, Solution.peelTheOnion(3, 3));
    assertArrayEquals(new int[]{56, 8}, Solution.peelTheOnion(4, 3));
    assertArrayEquals(new int[]{98, 26, 1}, Solution.peelTheOnion(5, 3));

    assertArrayEquals(new int[]{1}, Solution.peelTheOnion(1, 4));
    assertArrayEquals(new int[]{16}, Solution.peelTheOnion(2, 4));
    assertArrayEquals(new int[]{80, 1}, Solution.peelTheOnion(3, 4));
    assertArrayEquals(new int[]{240, 16}, Solution.peelTheOnion(4, 4));
    assertArrayEquals(new int[]{544, 80, 1}, Solution.peelTheOnion(5, 4));

    assertArrayEquals(new int[]{
        2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647,
        2147483647, 865782272, 124140032, 9815552, 261632, 512
    }, Solution.peelTheOnion(24, 9));
  }
}
