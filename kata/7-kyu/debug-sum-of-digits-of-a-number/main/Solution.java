interface Solution {
  static int sumOfDigits(int n) {
    return (n + "").chars().map(d -> d - 48).sum();
  }
}