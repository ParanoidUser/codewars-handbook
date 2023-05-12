import java.util.LinkedList;

class LoopInspector {
  int loopSize(Node head) {
    var nodes = new LinkedList<Node>();
    while (!nodes.contains(head)) {
      nodes.add(head);
      head = head.getNext();
    }
    return nodes.size() - nodes.indexOf(head);
  }
}