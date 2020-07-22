interface Dinglemouse {
  static double zigZagCamel(double d, double h) {
    return d / h > 1.7 ? Math.sqrt(d * d + h * h) : h + h;
  }
}