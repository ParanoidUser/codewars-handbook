interface RobinsonCrusoe {
  static double[] crusoe(int n, double d, double ang, double distmult, double angmult) {
    var xy = new double[2];
    for (ang = Math.toRadians(ang); n > 0; n--, d *= distmult, ang *= angmult) {
      xy[0] += d * Math.cos(ang);
      xy[1] += d * Math.sin(ang);
    }
    return xy;
  }
}
