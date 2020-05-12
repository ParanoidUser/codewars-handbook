interface Kata {
  static int[] getSize(int w, int h, int d) {
    return new int[]{2 * (w * h + h * d + d * w), w * h * d};
  }
}
