interface Solution {
  static int[] withdraw(int n) {
    int fifty = n % 20 > 0 && (n -= 50) >= 0 ? 1 : 0;
    return new int[]{n / 100, fifty, n % 100 / 20};
  }
}