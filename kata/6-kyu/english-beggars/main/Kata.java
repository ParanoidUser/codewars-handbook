interface Kata {
  static int[] beggars(int[] values, int n) {
    var result = new int[n];
    for (var i = 0; n > 0 && i < values.length; i++) {
      result[i % n] += values[i];
    }
    return result;
  }
}
