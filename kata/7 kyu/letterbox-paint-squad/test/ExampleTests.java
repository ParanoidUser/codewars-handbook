import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void ex() {
    assertArrayEquals(new int[] {1, 9, 6, 3, 0, 1, 1, 1, 1, 1}, Dinglemouse.paintLetterboxes(125, 132));
  }
}
