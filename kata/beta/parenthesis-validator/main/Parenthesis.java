interface Parenthesis {
  static boolean validate(String s) {
    int n = 0;
    for (char c : s.toCharArray()) {
      n += c == '(' ? 1 : -1;
      if (n < 0) {
        return false;
      }
    }
    return n == 0;
  }
}