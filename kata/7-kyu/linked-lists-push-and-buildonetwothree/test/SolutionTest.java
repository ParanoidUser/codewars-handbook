import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testPush() {
    assertEquals("Should be able to create a new linked list with push().", 1, Node.push(null, 1).data);
    assertEquals("Should be able to create a new linked list with push().", null, Node.push(null, 1).next);
    assertEquals("Should be able to prepend a node to an existing node.", 2, Node.push(new Node(1), 2).data);
    assertEquals("Should be able to prepend a node to an existing node.", 1, Node.push(new Node(1), 2).next.data);
  }

  @Test
  public void testBuild123() {
    assertEquals("Value at index 0 should be 1.", 1, Node.buildOneTwoThree().data);
    assertEquals("Value at index 1 should be 2.", 2, Node.buildOneTwoThree().next.data);
    assertEquals("Value at index 2 should be 3.", 3, Node.buildOneTwoThree().next.next.data);
    assertEquals("Value at index 3 should be null.", null, Node.buildOneTwoThree().next.next.next);
  }
}
