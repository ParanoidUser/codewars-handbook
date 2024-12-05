interface Points_On_A_Line {
  static int middle_point(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3) {
    double d12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
    double d23 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2) + Math.pow(z2 - z3, 2));
    double d13 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2) + Math.pow(z1 - z3, 2));
    return d12 > d13 && d12 > d23 ? 3 : d13 > d12 && d13 > d23 ? 2 : 1;
  }
}