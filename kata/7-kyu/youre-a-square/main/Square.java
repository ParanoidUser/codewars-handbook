interface Square {
  static boolean isSquare(int n) {
    return Math.sqrt(n) % 1 == 0;
  }
}
