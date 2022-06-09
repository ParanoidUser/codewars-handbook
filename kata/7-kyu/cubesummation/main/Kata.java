interface Kata {
  static long cubeSum(long n, long m) {
    n += n * n;
    m += m * m;
    return Math.abs(n * n - m * m) / 4;
  }
}