import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CharCodeCalculationTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      M, 12
      jaam, 12
      abcdef, 6
      ifkhchlhfd, 6
      aaaaaddddr, 30
      jfmgklf8hglbe, 6
      abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ, 96
      """)
  void sample(String s, int expected) {
    assertEquals(expected, Kata.calc(s));
  }
}