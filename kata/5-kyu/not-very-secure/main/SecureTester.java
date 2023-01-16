interface SecureTester {
  static boolean alphanumeric(String s) {
    return s.matches("\\p{Alnum}+");
  }
}