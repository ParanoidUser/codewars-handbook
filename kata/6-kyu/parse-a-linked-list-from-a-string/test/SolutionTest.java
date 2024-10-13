import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertNull(Kata.parseLinkedList("null"));
    assertEquals(new Node(1), Kata.parseLinkedList("1 -> null"));
    assertEquals(new Node(1, new Node(2, new Node(3))), Kata.parseLinkedList("1 -> 2 -> 3 -> null"));
  }
}