record Node(int data, Node next) {
  Node(int data) {
    this(data, null);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof Node && toString().equals(other.toString());
  }

  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  @Override
  public String toString() {
    return data + " -> " + next;
  }
}