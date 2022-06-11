import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(11, BasicOperations.basicMath("+", 4, 7));
    assertEquals(-3, BasicOperations.basicMath("-", 15, 18));
    assertEquals(25, BasicOperations.basicMath("*", 5, 5));
    assertEquals(7, BasicOperations.basicMath("/", 49, 7));
  }
}
