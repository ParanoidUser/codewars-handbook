interface Kata {
  static boolean compare(String s1, String s2) {
    return (s1 != null && s1.matches("[a-zA-Z]+") ? s1.toUpperCase().chars().sum() : 0) ==
           (s2.matches("[a-zA-Z]+") ? s2.toUpperCase().chars().sum() : 0);
  }
}
