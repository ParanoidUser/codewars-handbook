interface Kata {
  static String removeParentheses(String str) {
    return (str = str.replaceAll("\\([^()]*\\)", "")).contains("(") ? removeParentheses(str) : str;
  }
}