interface Kata {
  static int findSquares(int x, int y) {
    return y > 0 ? x * y + findSquares(--x, --y) : 0;
  }
}
