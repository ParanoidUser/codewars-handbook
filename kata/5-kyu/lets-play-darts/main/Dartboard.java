class Dartboard {
  String getScore(double x, double y) {
    int p = new int[]{6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10}
        [(int) ((6.44026 + Math.atan2(y, x)) % 6.2832 / .314159)];
    double r = Math.sqrt(x * x + y * y);
    if (r < 6.35) {
      return "DB";
    } else if (r < 15.9) {
      return "SB";
    } else if (r > 170) {
      return "X";
    } else if (r > 162) {
      return "D" + p;
    } else if (r > 99 && r < 107) {
      return "T" + p;
    }
    return "" + p;
  }
}