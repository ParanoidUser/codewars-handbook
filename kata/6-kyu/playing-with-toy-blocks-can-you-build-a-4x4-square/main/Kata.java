interface Kata {
  static boolean buildSquare(int[] blocks) {
    int[] count = new int[4];
    for (int b : blocks) {
      count[b - 1]++;
    }
    return count[3] + Math.min(count[0], count[2]) + (Math.max(count[0] - count[2], 0) / 2 + count[1]) / 2 > 3;
  }
}