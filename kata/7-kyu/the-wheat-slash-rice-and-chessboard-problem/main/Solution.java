interface Solution {
  static int squaresNeeded(long grains) {
    return 64 - Long.numberOfLeadingZeros(grains);
  }
}