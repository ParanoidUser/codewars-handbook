interface FeynmanSquare {
  static int countSquares(int n) {
    return (2 * n + 1) * (n + 1) * n / 6;
  }
}