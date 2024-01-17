interface Solution {
  static int[] digitize(int n) {
    return (n + "").chars().map(c -> c - 48).toArray();
  }
}