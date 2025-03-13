import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CatMouseTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      C....m, Escaped!
      C..m, Caught!
      C.....m, Escaped!
      C.m, Caught!
      C...m, Caught!
      Cm, Caught!
      """)
  void sample(String s, String expected) {
    assertEquals(expected, Kata.catMouse(s));
  }
}