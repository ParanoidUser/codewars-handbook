import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DigitizeExampleTests {
  @Test
  public void tests() {
    assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
  }
}
