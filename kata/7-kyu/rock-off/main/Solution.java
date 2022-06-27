interface Solution {
  static String solveRockOff(int[] alice, int[] bob) {
    int a = 0;
    int b = 0;
    for (var i = 0; i < alice.length; i++) {
      a += alice[i] > bob[i] ? 1 : 0;
      b += alice[i] < bob[i] ? 1 : 0;
    }
    return String.format("%s, %s: ", a, b) + (a == b
            ? "that looks like a \"draw\"! Rock on!"
            : a > b ? "Alice made \"Kurt\" proud!" : "Bob made \"Jeff\" proud!");
  }
}
