class Solution {
  int Ackermann(int m, int n) {
    return m > 0 ? n > 0 ? Ackermann(m - 1, Ackermann(m, --n)) : Ackermann(--m, 1) : ++n;
  }
}
