import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class USDtoCNYTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      15, 101.25 Chinese Yuan
      465, 3138.75 Chinese Yuan
      """)
  void sample(int usd, String expected) {
    assertEquals(expected, Kata.usdcny(usd));
  }
}