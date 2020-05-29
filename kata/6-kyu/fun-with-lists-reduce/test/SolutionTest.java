import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.reduce(null, Integer::sum, 0));
    assertEquals(6, Solution.reduce(new Node<>(1, new Node<>(2, new Node<>(3))), Integer::sum, 0));
    assertEquals(24, Solution.reduce(new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(4)))), (a, b) -> a * b, 1));
    assertEquals("abc", Solution.reduce(new Node<>("a", new Node<>("b", new Node<>("c"))), (a, b) -> a + b, ""));
  }
}