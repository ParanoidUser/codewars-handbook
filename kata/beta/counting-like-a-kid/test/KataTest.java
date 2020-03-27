import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void exampleTests() {
    assertArrayEquals(new int[] {1, 3, 5, 7, 9}, Kata.kidoCount(10));
    assertArrayEquals(new int[] {1, 3, 5, 7, 9, 11}, Kata.kidoCount(11));
  }
}
