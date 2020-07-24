interface Kata {
  static int[] sortArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; array[i] % 2 > 0 && j < i; j++) {
        if (array[j] % 2 > 0 && array[j] > array[i]) {
          array[i] = (array[i] + array[j]) - (array[j] = array[i]);
        }
      }
    }
    return array;
  }
}
