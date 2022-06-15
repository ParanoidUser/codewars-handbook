import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void smallArray() {
    assertArrayEquals(new String[]{"true", "false", "true", "false", "true"},
        Kata.alternate(5, "true", "false"));
  }

  @Test
  void largerArray() {
    assertArrayEquals(new String[]{
            "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red",
            "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"},
        Kata.alternate(20, "blue", "red"));
  }

  @Test
  void withZero() {
    assertArrayEquals(new String[0],
        Kata.alternate(0, "lemons", "apples"));
  }
}
