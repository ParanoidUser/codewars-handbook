import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertEquals("one, two, three and four", Kata.formatWords(new String[] {"one", "two", "three", "four"}));
    assertEquals("one", Kata.formatWords(new String[] {"one"}));
    assertEquals("one and three", Kata.formatWords(new String[] {"one", "", "three"}));
    assertEquals("three", Kata.formatWords(new String[] {"", "", "three"}));
    assertEquals("one and two", Kata.formatWords(new String[] {"one", "two", ""}));
    assertEquals("", Kata.formatWords(new String[] {}));
    assertEquals("", Kata.formatWords(null));
    assertEquals("", Kata.formatWords(new String[] {""}));
  }
}
