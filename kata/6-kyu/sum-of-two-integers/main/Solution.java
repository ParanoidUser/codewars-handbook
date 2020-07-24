interface Solution {
  static int add(int x, int y) {
    return y == 0 ? x : add(x ^ y, (x & y) << 1);
  }
}
