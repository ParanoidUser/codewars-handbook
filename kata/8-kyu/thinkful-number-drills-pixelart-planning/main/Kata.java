interface Kata {
  static boolean isDivisible(int wallLength, int pixelSize) {
    return wallLength % pixelSize == 0;
  }
}
