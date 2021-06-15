interface PiApprox {
  static String iterPi2String(double epsilon) {
    double pi = 0;
    var count = 1;
    while ((Math.abs(Math.PI - 4 * (pi += ((count % 2 == 0 ? -1. : 1.) / (2 * count - 1)))) > epsilon)) {
      count++;
    }
    return "[" + count + ", " + Math.round(40e9 * pi) / 10e9 + "]";
  }
}
