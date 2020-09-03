import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Solution.length(null));
    assertEquals(4, Solution.length(new Node(1, new Node(2, new Node(3, new Node(4))))));
  }
}