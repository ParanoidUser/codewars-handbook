interface Kata {
  static long sumMul(int n, int m) {
    if (n > 0 && m > 0) return (m = --m / n) * ++m * n / 2;
    throw new IllegalArgumentException();
  }
}
