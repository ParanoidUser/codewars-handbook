interface Solution {
  static int[] withdraw(int n) {
    var fifty = 0;
    if (n % 20 > 0) {
      fifty = 1;
      n -= 50;
    }
    return new int[]{n / 100, fifty, n % 100 / 20};
  }
}