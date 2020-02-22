class Solution {
  static int fruit(String[][] reels, int[] spins) {
    for (int i = 0; i < 3; i++) {
      spins[i] = "JaQuKiBaChSeShBeStWi".indexOf(reels[i][spins[i]].substring(0, 2)) / 2 + 1;
    }
    int multi = spins[0] == spins[1] && spins[1] == spins[2] ? 10 : 0;
    if (multi == 0 && (spins[0] == spins[1] || spins[1] == spins[2] || spins[0] == spins[2])) {
      multi = (spins[0] == spins[1] ? spins[2] : spins[1] == spins[2] ? spins[0] : spins[1]) < 10 ? 1 : 2;
      spins[0] = spins[1] == spins[2] ? spins[1] : spins[0];
    }
    return multi * spins[0];
  }
}
