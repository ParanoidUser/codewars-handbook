import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {
  @Test
  public void test2() {
    Node n = new Node();
    n.data = 1337;
    n.next = new Node();
    n.next.data = 42;
    n.next.next = new Node();
    n.next.next.data = 23;
    assertEquals(Node.getNth(n, 0), 1337);
    assertEquals(Node.getNth(n, 1), 42);
    assertEquals(Node.getNth(n, 2), 23);
  }

  @Test(expected = RuntimeException.class)
  public void testNull() {
    Node.getNth(null, 0);
  }

  @Test(expected = RuntimeException.class)
  public void testWrongIdx() {
    Node.getNth(new Node(), 1);
  }
}
