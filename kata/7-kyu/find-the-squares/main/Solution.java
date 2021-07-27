interface Solution {
  static String findSquares(long n) {
    return (n /= 2) * n + 2 * n + 1 + "-" + n * n;
  }
}