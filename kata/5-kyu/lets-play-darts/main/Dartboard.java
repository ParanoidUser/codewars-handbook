class Dartboard {
  static String getScore(double x, double y) {
    int p = new int[]{6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10}
        [(int) ((6.44026 + Math.atan2(y, x)) % 6.2832 / .314159)];
    double r = Math.sqrt(x * x + y * y);
    return r < 6.35 ? "DB" :
           r < 15.9 ? "SB" :
           r > 170 ? "X" :
           r > 162 ? "D" + p :
           r > 107 || r < 99 ? "" + p : "T" + p;
  }
}