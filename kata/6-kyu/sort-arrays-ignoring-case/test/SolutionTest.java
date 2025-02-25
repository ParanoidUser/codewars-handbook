import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"fine", "Hello", "I'm", "there"}, Kata.sort(new String[]{"Hello", "there", "I'm", "fine"}));
    assertArrayEquals(new String[]{"a", "B", "C", "d"}, Kata.sort(new String[]{"C", "d", "a", "B"}));
    assertArrayEquals(new String[]{"CodeWars"}, Kata.sort(new String[]{"CodeWars"}));
    assertArrayEquals(new String[]{}, Kata.sort(new String[]{}));
  }
}