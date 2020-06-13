interface Epidem {
  static int epidemic(int tm, double n, double s0, double i0, double b, double a) {
    double max = -1;
    while (i0 > max) {
      max = i0;
      double temp = tm / n * b * s0 * i0;
      i0 += temp - tm / n * a * i0;
      s0 -= temp;
    }
    return (int) max;
  }
}
