import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Hi", Kata.remove("Hi!", 1));
    assertEquals("Hi", Kata.remove("Hi!", 100));
    assertEquals("Hi!!", Kata.remove("Hi!!!", 1));
    assertEquals("Hi", Kata.remove("Hi!!!", 100));
    assertEquals("Hi", Kata.remove("!Hi", 1));
    assertEquals("Hi!", Kata.remove("!Hi!", 1));
    assertEquals("Hi", Kata.remove("!Hi!", 100));
    assertEquals("!!Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 1));
    assertEquals("Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 3));
    assertEquals("Hi hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 5));
    assertEquals("Hi hi hi", Kata.remove("!!!Hi !!hi!!! !hi", 100));
  }
}
