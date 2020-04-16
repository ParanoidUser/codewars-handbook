class Barycenter {
  static double[] barTriang(double[] x, double[] y, double[] z) {
    var x0 = Math.round((x[0] + y[0] + z[0]) * 3333.33) / 10.0e3;
    var y0 = Math.round((x[1] + y[1] + z[1]) * 3333.33) / 10.0e3;
    return new double[] {x0, y0};
  }
}
