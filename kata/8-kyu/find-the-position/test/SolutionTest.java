import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("Position of alphabet: 1", Kata.position('a'));
    assertEquals("Position of alphabet: 26", Kata.position('z'));
    assertEquals("Position of alphabet: 5", Kata.position('e'));
  }
}
