interface Solution {
  static int zeros(int n) {
    return n / 5 + (n > 25 ? zeros(n / 5) : 0);
  }
}