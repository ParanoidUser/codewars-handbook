class Node {
  private int data;
  private Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  public int getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }
}
