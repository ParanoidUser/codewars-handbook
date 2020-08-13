interface IdentifierChecker {
  static boolean isValid(String idn) {
    return idn.matches("[a-zA-Z$_][$\\w]+");
  }
}
