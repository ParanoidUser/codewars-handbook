interface Solution {
  static boolean validParentheses(String parens) {
    int count = 0;
    for (char c : parens.toCharArray()) {
      if (c == '(') {
        count++;
      } else if (c == ')') {
        count--;
      }
      if (count < 0) {
        return false;
      }
    }
    return count == 0;
  }
}