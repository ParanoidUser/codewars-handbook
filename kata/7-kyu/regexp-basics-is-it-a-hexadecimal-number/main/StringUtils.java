interface StringUtils {
  static boolean isHexNumber(String s) {
    return s.matches("(?i)(0x)?[\\da-f]+");
  }
}
