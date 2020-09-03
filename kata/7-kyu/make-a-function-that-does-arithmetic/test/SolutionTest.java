import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, ArithmeticFunction.arithmetic(1, 2, "add"));
    assertEquals(6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
    assertEquals(10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
    assertEquals(4, ArithmeticFunction.arithmetic(8, 2, "divide"));
  }
}