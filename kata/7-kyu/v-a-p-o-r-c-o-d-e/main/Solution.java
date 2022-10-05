interface Solution {
  static String vaporcode(String s) {
    s = s.replace(" ", "").replace("", "  ");
    return s.toUpperCase().substring(2, s.length() - 2);
  }
}