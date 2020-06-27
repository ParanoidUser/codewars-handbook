interface GCDsum {
  static int[] solve(int s, int g) {
    return s % g > 0 ? new int[]{-1, -1} : new int[]{g, s - g};
  }
}