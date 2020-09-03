import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NodeTest {
  @Test
  void sample() {
    Node n = new Node();
    n.data = 1337;
    n.next = new Node();
    n.next.data = 42;
    n.next.next = new Node();
    n.next.next.data = 23;
    assertEquals(1337, Node.getNth(n, 0));
    assertEquals(42, Node.getNth(n, 1));
    assertEquals(23, Node.getNth(n, 2));

    assertThrows(NullPointerException.class, () -> Node.getNth(n, 3));
  }
}
