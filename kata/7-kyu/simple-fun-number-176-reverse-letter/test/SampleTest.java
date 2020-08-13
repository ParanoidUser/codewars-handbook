import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("nahsirk", Kata.reverseLetter("krishan"));
    assertEquals("nortlu", Kata.reverseLetter("ultr53o?n"));
    assertEquals("cba", Kata.reverseLetter("ab23c"));
    assertEquals("nahsirk", Kata.reverseLetter("krish21an"));
  }
}
