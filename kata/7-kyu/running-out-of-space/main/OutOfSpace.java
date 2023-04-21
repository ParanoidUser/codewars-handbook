interface OutOfSpace {
  static String[] spacey(String[] array) {
    for (int i = 1; i < array.length; i++) {
      array[i] = array[i - 1] + array[i];
    }
    return array;
  }
}