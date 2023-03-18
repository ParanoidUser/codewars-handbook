interface Kata {
  static boolean validParentheses(String p) {
    return p.chars().reduce(0, (s, c) -> s < 0 ? s : c == '(' ? ++s : --s) == 0;
  }
}