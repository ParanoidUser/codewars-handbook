import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTests() {
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
