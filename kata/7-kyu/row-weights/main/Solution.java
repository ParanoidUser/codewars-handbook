class Solution {
  static int[] rowWeights(int[] weights) {
    int[] total = new int[2];
    for (int i = 0; i < weights.length; i++) {
      total[i % 2] += weights[i];
    }
    return total;
  }
}
