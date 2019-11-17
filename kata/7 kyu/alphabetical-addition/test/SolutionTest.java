import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void fixedTests() {
    assertEquals("f", Kata.addLetters("a", "b", "c"));
    assertEquals("z", Kata.addLetters("z"));
    assertEquals("c", Kata.addLetters("a", "b"));
    assertEquals("c", Kata.addLetters("c"));
    assertEquals("a", Kata.addLetters("z", "a"));
    assertEquals("d", Kata.addLetters("y", "c", "b"));
    assertEquals("z", Kata.addLetters());
  }
}
