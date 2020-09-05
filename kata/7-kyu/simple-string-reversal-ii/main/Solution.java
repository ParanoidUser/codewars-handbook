interface Solution {
  static String solve(String s, int a, int b) {
    return s.substring(0, a) + new StringBuilder(s.substring(a, b = Math.min(b + 1, s.length()))).reverse() + s.substring(b);
  }
}