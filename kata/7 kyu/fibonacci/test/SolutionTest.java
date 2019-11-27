import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals(1, Fibonacci.fib(1));
    assertEquals(1, Fibonacci.fib(2));
    assertEquals(2, Fibonacci.fib(3));
    assertEquals(3, Fibonacci.fib(4));
    assertEquals(5, Fibonacci.fib(5));
  }
}
