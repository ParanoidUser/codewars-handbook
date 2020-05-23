interface CoinFree {
  static int solve(int amount, int[] coinAmounts) {
    int i = coinAmounts.length - 1, coins = amount / coinAmounts[i];
    while ((amount %= coinAmounts[i--]) > 0) {
      coins += amount / coinAmounts[i];
    }
    return coins;
  }
}