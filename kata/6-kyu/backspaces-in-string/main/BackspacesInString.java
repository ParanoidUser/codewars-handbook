class BackspacesInString {
  static String cleanString(String s) {
    while (s.matches(".*#.*")) s = s.replaceFirst(".?#", "");
    return s;
  }
}
