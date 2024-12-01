interface Pronic {
  static boolean isPronic(int n) {
    return Math.sqrt(4 * n + 1.) % 1 == 0;
  }
}