class Helpers {
  @SafeVarargs
  static <T> Node<T> listFromArray(T... array) {
    if (array.length == 0) return null;
    Node<T> head = new Node<>(array[0]);
    Node<T> prev = head;
    for (int i = 1; i < array.length; i++) {
      Node<T> curr = new Node<>(array[i]);
      prev.setNext(curr);
      prev = curr;
    }
    return head;
  }

  static Node<Integer> listFromArray(int[] array) {
    return listFromArray(java.util.Arrays.stream(array).boxed().toArray(Integer[]::new));
  }

  static int[] randomArray(int size) {
    return new java.util.Random().ints(-100, 100).limit(size).toArray();
  }

  static int randomInt(int min, int max) {
    return (int) Math.floor(min + Math.random() * max);
  }
}
