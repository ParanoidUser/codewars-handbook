interface Solution {
  static int solve(String s) {
    return s.length() % 2 > 0 ? -1 : s.contains("()") ? solve(s.replace("()", "")) :
           (s.length() - (s = s.replaceAll("\\)\\)|\\(\\(", "")).length()) / 2 + s.length();
  }
}