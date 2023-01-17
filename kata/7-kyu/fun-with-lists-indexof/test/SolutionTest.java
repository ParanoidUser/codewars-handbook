import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(-1, Solution.indexOf(null, 17));
    assertEquals(1, Solution.indexOf(new Node(1, new Node(2, new Node(3))), 2));
    assertEquals(0, Solution.indexOf(new Node("aaa", new Node("b", new Node("abc"))), "aaa"));
    assertEquals(0, Solution.indexOf(new Node(17, new Node("17", new Node(1.2))), 17));
    assertEquals(1, Solution.indexOf(new Node(17, new Node("17", new Node(1.2))), "17"));
    assertEquals(2, Solution.indexOf(new Node(1, new Node(2, new Node(3, new Node(3)))), 3));
  }
}