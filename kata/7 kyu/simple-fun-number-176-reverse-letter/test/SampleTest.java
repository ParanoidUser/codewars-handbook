import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void testSomething() {
    assertEquals("nahsirk", Kata.reverseLetter("krishan"));
    assertEquals("nortlu", Kata.reverseLetter("ultr53o?n"));
    assertEquals("cba", Kata.reverseLetter("ab23c"));
    assertEquals("nahsirk", Kata.reverseLetter("krish21an"));
  }
}
