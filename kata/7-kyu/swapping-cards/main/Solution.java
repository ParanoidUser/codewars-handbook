interface Solution {
  static boolean swapCards(int n1, int n2) {
    return n1 / 10 > n1 % 10 || (n1 / 10 - n2 / 10) * 10 < (n1 - n2) % 10;
  }
}