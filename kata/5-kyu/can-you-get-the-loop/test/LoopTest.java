import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopTest {
  @Test
  void sample() {
    var loop = new LoopInspector();
    assertEquals(3, loop.loopSize(link(1, 3)));
    assertEquals(29, loop.loopSize(link(21, 29)));
    assertEquals(1087, loop.loopSize(link(3904, 1087)));
  }

  private Node link(int tail, int loop) {
    Node prev = new Node();
    Node head = prev;
    head.setNext(head);

    for (int i = 0; i < tail; i++) {
      prev.setNext(new Node());
      prev = prev.getNext();
    }

    Node end = prev;
    for (int i = 1; i < loop; i++) {
      prev.setNext(new Node());
      prev = prev.getNext();
    }
    prev.setNext(end);
    return head;
  }
}