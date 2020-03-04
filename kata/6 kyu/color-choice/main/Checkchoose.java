class Checkchoose {
  static long checkchoose(long m, long n) {
    long colors = 1;
    for (int i = 0; i < n; colors = colors * (n - i) / ++i) {
      if (colors == m) {
        return i;
      }
    }
    return -1;
  }
}
