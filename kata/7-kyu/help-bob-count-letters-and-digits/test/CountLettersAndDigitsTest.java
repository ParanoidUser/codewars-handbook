
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountLettersAndDigitsTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      '', 0
      ?, 0
      1, 1
      hel2!lo, 6
      n!!_ice!!123, 7
      aBcDeFg090, 10
      12345f%%%t5t&/6, 10
      u_n_d_e_r__S_C_O_R_E, 10
      """)
  void sample(String s, int expected) {
    assertEquals(expected, Kata.countLettersAndDigits(s));
  }
}