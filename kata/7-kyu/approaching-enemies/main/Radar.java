interface Radar {
  static double calculateTime(double[] p1, double[] p2) {
    return Math.hypot(p2[1], p2[0]) / Math.hypot(p1[1] - p2[1], p1[0] - p2[0]) * 5;
  }
}
