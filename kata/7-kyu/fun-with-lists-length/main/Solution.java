interface Solution {
  static int length(Node head) {
    return head == null ? 0 : 1 + length(head.next);
  }
}