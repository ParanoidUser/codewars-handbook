import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    var n1 = Kata.parseLinkedList("1 -> null");
    assertEquals(1, n1.data);
    assertNull(n1.next);

    var n2 = Kata.parseLinkedList("1 -> 2 -> 3 -> null");
    assertEquals(1, n2.data);
    assertEquals(2, n2.next.data);
    assertEquals(3, n2.next.next.data);
    assertNull(n2.next.next.next);

    assertNull(Kata.parseLinkedList("null"));
  }
}