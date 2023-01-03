import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KataTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
              12, 21
             144, 414
             414, 441
             513, 531
            2017, 2071
           10990, 19009
      9876543210, -1
      """)
  void sample(long n, long expected) {
    assertEquals(expected, Kata.nextBiggerNumber(n));
  }
}