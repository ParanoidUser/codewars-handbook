interface Solution {
  static String solve(String str) {
    return str.length() < 2 * str.replaceAll("[a-z]", "").length() ? str.toUpperCase() : str.toLowerCase();
  }
}
