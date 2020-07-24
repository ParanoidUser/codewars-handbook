import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RotatorTest {
  @Test
  void sample() {
    assertArrayEquals(new Object[] {5, 1, 2, 3, 4}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 1));
    assertArrayEquals(new Object[] {4, 5, 1, 2, 3}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 2));
    assertArrayEquals(new Object[] {3, 4, 5, 1, 2}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 3));
    assertArrayEquals(new Object[] {2, 3, 4, 5, 1}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 4));
    assertArrayEquals(new Object[] {1, 2, 3, 4, 5}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 5));
    assertArrayEquals(new Object[] {5, 1, 2, 3, 4}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, 6));
    assertArrayEquals(new Object[] {2, 3, 4, 5, 1}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -1));
    assertArrayEquals(new Object[] {3, 4, 5, 1, 2}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -2));
    assertArrayEquals(new Object[] {4, 5, 1, 2, 3}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -3));
    assertArrayEquals(new Object[] {5, 1, 2, 3, 4}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -4));
    assertArrayEquals(new Object[] {1, 2, 3, 4, 5}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -5));
    assertArrayEquals(new Object[] {2, 3, 4, 5, 1}, Rotator.rotate(new Object[] {1, 2, 3, 4, 5}, -6));
  }
}
