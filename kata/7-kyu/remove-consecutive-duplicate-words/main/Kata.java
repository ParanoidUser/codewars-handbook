interface Kata {
  static String removeConsecutiveDuplicates(String s) {
    return s.replaceAll("(\\b\\S+)( \\1\\b)+", "$1");
  }
}