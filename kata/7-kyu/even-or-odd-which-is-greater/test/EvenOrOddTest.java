import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenOrOddTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      12, Even is greater than Odd
      123, Odd is greater than Even
      112, Even and Odd are the same
      """)
  void sample(String str, String expected) {
    assertEquals(expected, Kata.evenOrOdd(str));
  }
}