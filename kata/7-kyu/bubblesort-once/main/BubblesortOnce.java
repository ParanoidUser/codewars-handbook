interface BubblesortOnce {
  static int[] bubbleSortOnce(int[] array) {
    int[] copy = array.clone();
    for (int i = 0; i < copy.length - 1; i++) {
      if (copy[i] > copy[i + 1]) {
        copy[i] += copy[i + 1];
        copy[i + 1] = copy[i] - copy[i + 1];
        copy[i] -= copy[i + 1];
      }
    }
    return copy;
  }
}