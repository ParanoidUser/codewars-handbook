import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 0
      1, 1
      2, 1
      3, 2
      4, 3
      5, 5
      """)
  void sample(BigInteger input, BigInteger expected) {
    assertEquals(expected, Fibonacci.fib(input));
  }
}