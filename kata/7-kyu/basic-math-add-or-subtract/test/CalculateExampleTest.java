import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculateExampleTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1plus2plus3plus4, 10
      1minus2minus3minus4, -8
      1plus2plus3minus4, 2
      1minus2plus3minus4, -2
      1plus2minus3plus4minus5, -1
      """)
  void sample(String equation, String result) {
    assertEquals(result, Kata.calculate(equation));
  }
}