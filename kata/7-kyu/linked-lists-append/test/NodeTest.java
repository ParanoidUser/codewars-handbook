import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class NodeTest {
  @Test
  void sample() {
    assertNull(Node.append(null, null));
    assertNodeEquals(Node.append(null, new Node(1)), new Node(1));
    assertNodeEquals(Node.append(new Node(1), null), new Node(1));
    assertNodeEquals(Node.append(new Node(1), new Node(2)), new Node(1, new Node(2)));
    assertNodeEquals(Node.append(new Node(2), new Node(1)), new Node(2, new Node(1)));
    assertNodeEquals(Node.append(new Node(1, new Node(2)), new Node(3, new Node(4))), new Node(1, new Node(2, new Node(3, new Node(4)))));
    assertNodeEquals(Node.append(new Node(1, new Node(2, new Node(3, new Node(4, new Node(5))))), new Node(6, new Node(7, new Node(8)))), new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7, new Node(8)))))))));
  }

  static void assertNodeEquals(Node a, Node b) {
    while (a != null && b != null) {
      assertEquals(a.data, b.data);
      a = a.next;
      b = b.next;
    }
    assertNull(a);
    assertNull(b);
  }
}