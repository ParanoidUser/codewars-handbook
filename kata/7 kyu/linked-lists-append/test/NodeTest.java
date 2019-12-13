import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTest {
  @Test
  public void twoEmpty() {
    assertNull(Node.append(null, null));
  }

  @Test
  public void oneEmpty() {
    NodeHelper.assertNodeEquals(Node.append(null, new Node(1)), new Node(1));
    NodeHelper.assertNodeEquals(Node.append(new Node(1), null), new Node(1));
  }

  @Test
  public void oneOne() {
    NodeHelper.assertNodeEquals(Node.append(new Node(1), new Node(2)), NodeHelper.build(new int[] {1, 2}));
    NodeHelper.assertNodeEquals(Node.append(new Node(2), new Node(1)), NodeHelper.build(new int[] {2, 1}));
  }

  @Test
  public void bigLists() {
    NodeHelper.assertNodeEquals(Node.append(NodeHelper.build(new int[] {1, 2}), NodeHelper.build(new int[] {3, 4})),
        NodeHelper.build(new int[] {1, 2, 3, 4}));
    NodeHelper.assertNodeEquals(Node.append(NodeHelper.build(new int[] {1, 2, 3, 4, 5}), NodeHelper.build(new int[] {6, 7, 8})),
        NodeHelper.build(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
  }
}
