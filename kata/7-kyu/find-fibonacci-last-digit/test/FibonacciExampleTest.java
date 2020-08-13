import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciExampleTest {
  @Test
  void sample() {
    assertEquals(5, Fibonacci.getFibNumb(193150));
    assertEquals(0, Fibonacci.getFibNumb(300));
    assertEquals(6, Fibonacci.getFibNumb(20001));
  }
}
