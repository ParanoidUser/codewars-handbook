interface Kata {
  static int pillars(int numPill, int dist, int width) {
    return numPill > 1 ? --numPill * dist * 100 + --numPill * width : 0;
  }
}