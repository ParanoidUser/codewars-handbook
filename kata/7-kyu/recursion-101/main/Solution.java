interface Solution {
  static int[] solve(int a, int b) {
    for (var i = 0; i < 3; i++) {
      a %= 2 * Math.max(b, 1);
      b %= 2 * Math.max(a, 1);
    }
    return new int[]{a, b};
  }
}