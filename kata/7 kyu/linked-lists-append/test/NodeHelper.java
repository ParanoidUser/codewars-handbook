import static org.junit.Assert.assertNull;

import org.junit.Assert;

class NodeHelper {
  static Node push(final Node head, final int data) {
    return new Node(data, head);
  }

  static Node build(int[] arr) {
    Node node = null;
    for (int i = arr.length - 1; i > -1; i--) {
      node = push(node, arr[i]);
    }
    return node;
  }

  static void assertNodeEquals(Node a, Node b) {
    while (a != null && b != null) {
      Assert.assertEquals(a.data, b.data);
      a = a.next;
      b = b.next;
    }
    assertNull(a);
    assertNull(b);
  }
}
