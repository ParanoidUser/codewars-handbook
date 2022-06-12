interface VolTank {
  static int tankVol(double h, double d, double vt) {
    h = 1 - 2 * h / d;
    d = Math.acos(h);
    return (int) (vt * (d - Math.sin(d) * h) / Math.PI);
  }
}
