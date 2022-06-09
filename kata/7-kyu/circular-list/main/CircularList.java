class CircularList<T> {
  private final T[] elements;
  private int pointer = -1;

  @SafeVarargs
  CircularList(T... elements) {
    if (elements.length == 0) throw new IllegalArgumentException();
    this.elements = elements;
  }

  T next() {
    if (++pointer > elements.length - 1) {
      pointer = 0;
    }
    return elements[pointer];
  }

  T prev() {
    if (--pointer < 0) {
      pointer = elements.length - 1;
    }
    return elements[pointer];
  }
}
