interface Kata {
  static String integrate(int coefficient, int exponent) {
    return coefficient / ++exponent + "x^" + exponent;
  }
}
