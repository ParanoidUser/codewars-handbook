interface Kata {
  static int sequenceSum(int start, int end, int step) {
    int n = (end - start) / step + 1;
    return start > end ? 0 : n * start + n * (n - 1) / 2 * step;
  }
}