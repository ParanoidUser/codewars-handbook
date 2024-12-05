import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Solution.searchKFromEnd(build(5, 2, 3, 1), 1));
    assertEquals(3, Solution.searchKFromEnd(build(5, 2, 3, 1), 2));
    assertEquals(2, Solution.searchKFromEnd(build(5, 2, 3, 1), 3));
    assertEquals(5, Solution.searchKFromEnd(build(5, 2, 3, 1), 4));
    assertNull(Solution.searchKFromEnd(build(5, 2, 3, 1), 5));
    assertEquals(23, Solution.searchKFromEnd(build(19, 18, 17, 16, 4, 3, 4, 2, 1, 65, 23, 3, 12, 34, 2, 6, 2), 7));
  }

  private Node build(int... values) {
    Node head = null;
    for (int i = values.length - 1; i >= 0; i--) {
      head = new Node(values[i], head);
    }
    return head;
  }
}