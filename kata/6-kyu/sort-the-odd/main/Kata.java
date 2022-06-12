interface Kata {
  static int[] sortArray(int[] array) {
    for (var i = 0; i < array.length; i++) {
      for (var j = 0; array[i] % 2 > 0 && j < i; j++) {
        if (array[j] % 2 > 0 && array[j] > array[i]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
}
