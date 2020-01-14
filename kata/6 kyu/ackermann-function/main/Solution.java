class Solution {
  static int Ackermann(int m, int n) {
    return m == 0 ? n + 1 : m > 0 && n == 0 ? Ackermann(m - 1, 1) : Ackermann(m - 1, Ackermann(m, n - 1));
  }
}
