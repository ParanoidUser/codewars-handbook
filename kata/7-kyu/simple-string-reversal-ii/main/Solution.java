interface Solution {
  static String solve(String s, int a, int b) {
    b = Math.min(b + 1, s.length());
    return s.substring(0, a) + new StringBuilder(s.substring(a, b)).reverse() + s.substring(b);
  }
}