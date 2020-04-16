import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleKataTests {
  @Test
  public void tests() {
    assertArrayEquals(new int[] {5, 10, 15}, Kata.multiples(3, 5));
  }
}
