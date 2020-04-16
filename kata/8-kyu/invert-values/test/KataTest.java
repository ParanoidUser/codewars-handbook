import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void testSomething() {
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Kata.invert(new int[] {-1, -2, -3, -4, -5}));
    assertArrayEquals(new int[] {1, -2, 3, -4, 5}, Kata.invert(new int[] {-1, 2, -3, 4, -5}));
    assertArrayEquals(new int[0], Kata.invert(new int[0]));
    assertArrayEquals(new int[] {0}, Kata.invert(new int[] {0}));
  }
}
