interface VolTank {
  static int tankVol(double h, double d, double vt) {
    return (int) (vt * ((d = Math.acos(h = 1 - 2 * h / d)) - Math.sin(d) * h) / Math.PI);
  }
}
