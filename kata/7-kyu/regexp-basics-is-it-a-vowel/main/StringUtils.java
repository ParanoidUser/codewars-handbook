interface StringUtils {
  static boolean isVowel(String s) {
    return s.matches("(?i)[aeiou]");
  }
}
