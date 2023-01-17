import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertNull(Node.push(null, 1).next);
    assertEquals(1, Node.push(null, 1).data);
    assertEquals(2, Node.push(new Node(1), 2).data);
    assertEquals(1, Node.push(new Node(1), 2).next.data);

    assertEquals(1, Node.buildOneTwoThree().data);
    assertEquals(2, Node.buildOneTwoThree().next.data);
    assertEquals(3, Node.buildOneTwoThree().next.next.data);
    assertNull(Node.buildOneTwoThree().next.next.next);
  }
}