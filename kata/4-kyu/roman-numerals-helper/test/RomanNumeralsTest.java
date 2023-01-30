import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, I
      2, II
      """)
  void toRoman(int n, String expected) {
    assertEquals(expected, RomanNumerals.toRoman(n));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
       I, 1
      II, 2
      """)
  void fromRoman(String n, int expected) {
    assertEquals(expected, RomanNumerals.fromRoman(n));
  }
}