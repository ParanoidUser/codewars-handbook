import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    Node reverse = Kata.reverse(new Node(1, new Node(2, new Node(3, null))));
    assertEquals(3, reverse.data);
    assertEquals(2, reverse.next.data);
    assertEquals(1, reverse.next.next.data);
    assertNull(reverse.next.next.next);
  }
}
