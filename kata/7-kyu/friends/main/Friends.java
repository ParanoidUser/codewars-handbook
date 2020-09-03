interface Friends {
  static int friends(int n) {
    return n < 1 ? 0 : Integer.toBinaryString(n - 1).length() - 1;
  }
}
