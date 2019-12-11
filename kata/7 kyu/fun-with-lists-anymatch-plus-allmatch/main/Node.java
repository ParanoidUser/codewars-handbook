class Node<T> {
  public T data;
  public Node<T> next;

  Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  Node(T data) {
    this(data, null);
  }
}
