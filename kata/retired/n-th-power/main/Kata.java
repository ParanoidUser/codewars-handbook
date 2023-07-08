interface Kata {
  static int nthPower(int[] array, int n) {
    return n < array.length ? (int) Math.pow(array[n], n) : -1;
  }
}
