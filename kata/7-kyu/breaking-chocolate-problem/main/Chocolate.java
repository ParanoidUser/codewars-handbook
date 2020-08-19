interface Chocolate {
  static int breakChocolate(int n, int m) {
    return Math.max(n * m - 1, 0);
  }
}
