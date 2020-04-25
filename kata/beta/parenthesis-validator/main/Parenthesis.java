interface Parenthesis {
  static boolean validate(String s) {
    return s.chars().reduce(0, (t, p) -> t < 0 ? -1 : p > 40 ? --t : ++t) == 0;
  }
}