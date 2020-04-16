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
    assertEquals(1337, Node.getNth(n, 0));
    assertEquals(42, Node.getNth(n, 1));
    assertEquals(23, Node.getNth(n, 2));
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
