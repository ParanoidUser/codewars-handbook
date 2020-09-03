import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Fibonacci.fib(1));
    assertEquals(1, Fibonacci.fib(2));
    assertEquals(2, Fibonacci.fib(3));
    assertEquals(3, Fibonacci.fib(4));
    assertEquals(5, Fibonacci.fib(5));
  }
}
