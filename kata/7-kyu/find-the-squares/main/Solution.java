interface Solution {
  static String findSquares(long n) {
    n /= 2;
    return n * n + 2 * n + 1 + "-" + n * n;
  }
}