import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("", Kata.alternateCase(""));
    assertEquals("ABC", Kata.alternateCase("abc"));
    assertEquals("abc", Kata.alternateCase("ABC"));
    assertEquals("hELLO wORLD!", Kata.alternateCase("Hello World!"));
  }
}
