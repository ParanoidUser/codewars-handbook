interface Kata {
  static boolean validSpacing(String s) {
    return s.trim().replace("  ", "").equals(s);
  }
}