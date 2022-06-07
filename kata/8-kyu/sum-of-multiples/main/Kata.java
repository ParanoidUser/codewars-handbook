interface Kata {
  static long sumMul(long n, long m) {
    if (n > 0 && m > 0) {
      m = --m / n;
      return m * ++m * n / 2;
    }
    throw new IllegalArgumentException();
  }
}
