interface DivSeven {
  static long[] seven(long m) {
    var count = 0;
    while (m > 99) {
      m = m / 10 - 2 * (m % 10);
      count++;
    }
    return new long[]{m, count};
  }
}
