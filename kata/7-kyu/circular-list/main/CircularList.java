class CircularList<T> {
  private final T[] elements;
  private int pointer = -1;

  @SafeVarargs
  CircularList(T... elements) {
    if (elements.length == 0) throw new IllegalArgumentException();
    this.elements = elements;
  }

  T next() {
    return elements[(pointer = ++pointer > elements.length - 1 ? 0 : pointer)];
  }

  T prev() {
    return elements[(pointer = --pointer < 0 ? elements.length - 1 : pointer)];
  }
}
