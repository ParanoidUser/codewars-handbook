import static java.util.stream.IntStream.range;

class Solution {
  static int fruit(String[][] reels, int[] spins) {
    int xxx = 0, score = 0;
    int value = range(0, 3).map(i -> 16 << "JaQuKiBaChSeShBeStWi".indexOf(reels[i][spins[i]].substring(0, 2))).sum();
    for (int i = 0; i < 11; i++) {
      xxx = (value /= 4) % 4;
      score += xxx > 2 ? 10 * i : xxx > 1 ? i : 0;
    }
    return xxx < 2 ? ++xxx * score : score;
  }
}
