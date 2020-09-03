interface NegativeZeroValidator {
  static boolean isNegativeZero(Float n) {
    return n.equals(-0f);
  }
}
