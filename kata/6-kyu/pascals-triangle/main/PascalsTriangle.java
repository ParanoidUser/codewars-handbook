interface PascalsTriangle {
  static long[] generate(int level) {
    long[] pascal = new long[level * (level + 1) / 2];
    int i = 0;
    for (int l = 0; l < level; l++) {
      for (long f = 1, k = 0; k <= l; f = f * (l - k) / (k + 1), k++) {
        pascal[i++] = f;
      }
    }
    return pascal;
  }
}