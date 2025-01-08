import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Modulus11Test {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2356, 23566
      6789, 6789X
      036532, 0365327
      12388878, 123888782
      111111111, 1111111118
      9735597355, 97355973550
      """)
  void sample(String number, String check) {
    assertEquals(check, Modulus11.addCheckDigit(number));
  }
}