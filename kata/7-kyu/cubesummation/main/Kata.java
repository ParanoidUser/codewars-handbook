interface Kata {
  static long cubeSum(long n, long m) {
    return Math.abs((n += n * n) * n - (m += m * m) * m) / 4;
  }
}