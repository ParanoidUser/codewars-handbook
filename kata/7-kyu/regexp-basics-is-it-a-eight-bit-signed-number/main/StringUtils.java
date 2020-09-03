interface StringUtils {
  static boolean isSignedEightBitNumber(String s) {
    return s.matches("-128|-?12[0-7]|-?1[0-1]\\d|-?[1-9]\\d?|0");
  }
}
