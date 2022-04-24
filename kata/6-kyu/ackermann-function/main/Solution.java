interface Solution {
  static int ackermann(int m, int n) {
    return m > 0 ? n > 0 ? ackermann(m - 1, ackermann(m, --n)) : ackermann(--m, 1) : ++n;
  }
}
