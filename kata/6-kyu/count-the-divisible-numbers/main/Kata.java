interface Kata {
  static long divisibleCount(long x, long y, long k) {
    return y / k - x / k + (x % k > 0 ? 0 : 1);
  }
}
