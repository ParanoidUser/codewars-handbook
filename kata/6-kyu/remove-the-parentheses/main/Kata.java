interface Kata {
  static String removeParentheses(String str) {
    str = str.replaceAll("\\([^()]*\\)", "");
    return str.contains("(") ? removeParentheses(str) : str;
  }
}